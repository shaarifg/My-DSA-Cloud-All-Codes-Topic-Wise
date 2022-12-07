package implementationUsingLinkedList;

import java.util.ArrayList;

public class Map<K, V>{
    ArrayList<MapNode<K, V>> buckets;
    int count;//Number of MapNodes in Buckets arraylist.
    int bucketSize;

    Map(){
        buckets = new ArrayList<>();
        bucketSize = 20;
        for (int i = 0; i < 20; i++) {
            buckets.add(null);
        }
    }

    private int getBucketIndex(K key){
        int hc = key.hashCode();
        return hc%bucketSize;
    }
    public void insert(K key, V value){
        int bucketIndex  = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketIndex);

//        Traversing list if  key is already exist.
        while (head != null){
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }
//        Key doesn't exist so make new node
        head = buckets.get(bucketIndex);//Updating head to initial node.
        MapNode<K, V> newNode = new MapNode<>(key, value);
        newNode.next = head;
        buckets.set(bucketIndex, newNode);
        count++;
        double loadFactor = (1.0*count)/bucketSize;
        if(loadFactor>0.75){
            reHash();
        }

    }

    private void reHash() {
        ArrayList<MapNode<K, V>> temp =  buckets;
        buckets = new ArrayList<MapNode<K, V>>();
        for (int i = 0; i < 2*bucketSize; i++) {
            buckets.add(null);
        }
        count= 0;
        bucketSize = 2*bucketSize;
        for (int i = 0; i < temp.size(); i++) {
            MapNode<K, V> head = temp.get(i);
            while (head !=null){
                K key = head.key;
                V value = head.value;
                insert(key, value);
                head = head.next;
            }
        }
    }

    public int size(){
        return count;
    }
    public V get(K key){
        int bucketIndex  = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketIndex);
//        Searching for key
        while (head != null){
            if(head.key.equals(key)){
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

//    Return the value of deleted Key;
    public V remove(K key) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketIndex);
        MapNode<K, V> prev = null;
        while (head != null) {
            if (head.key.equals(key)) {
//                Take of case if key corresponds to first node of the list
                if(prev!= null){
                    prev.next = head.next;
                }else {
                    buckets.set(bucketIndex, head.next);
                }
                count--;
                return head.value;
            }
            prev = head;
            head = head.next;
        }
        return null;
    }
    public double loadFactor(){
        return (1.0*count)/bucketSize;
    }
}
