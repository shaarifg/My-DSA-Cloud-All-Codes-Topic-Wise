package Implementation;

import java.util.ArrayList;

//Max Heap
public class Heap<T extends Comparable<T>> {

    private ArrayList<T> list;

    Heap(){
        list = new ArrayList<>();
    }

    private void swap(int index1, int index2){
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }


    private int parent(int index){
        return (index-1)/2;
    }
    private int left(int index){
        return 2*index+1;
    }
    private int right(int index){
        return 2*index+2;
    }
    public void insert(T value){
//        add in the last
        list.add(value);

//      then call the up-heap to swap for bottom to top.
        upHeap(list.size()-1);

    }

    private void upHeap(int index) {
        if(index == 0) return;
        int p = parent(index);

//        if the item is smaller than parent then swap
        if(list.get(index).compareTo(list.get(p))<0){
            swap(index, p);
            upHeap(p);
        };
    }

    public T remove() throws Exception{
        if(list.isEmpty()) {
            throw new Exception("Can not remove from an empty Heap");
        }
        T temp = list.get(0);
        T last = list.remove(list.size()-1);
        if(!list.isEmpty()){
            list.set(0, last);
            downHeap(0);
        }
        return temp;
    }

        private void downHeap(int index) {
        int min = index;
        int left = left(index);
        int right =right(index);

//        if left exist
            if(left < list.size() && list.get(min).compareTo(list.get(left))>0){
                min = left;
            }
//            if right exist
            if(right < list.size() && list.get(min).compareTo(list.get(right))>0){
                min = right;
            }
            if(min != index){
                swap(min, index);
                downHeap(min);
            }
    }

//    Heap sort

    public ArrayList<T> heapSort() throws Exception{
        ArrayList<T> data = new ArrayList<>();
        while (!list.isEmpty()){
            data.add(this.remove());
        }
        return data;
    }


}
