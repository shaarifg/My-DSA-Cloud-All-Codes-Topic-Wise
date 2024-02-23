// this is queue where size is fixed
public class CustomQueue {
    protected int[] data;
    protected static final int DEFAULT_SIZE = 10;
    private int end = 0;

    CustomQueue(){
        this(DEFAULT_SIZE);
    }

    CustomQueue(int size){
        data = new int[size];
    }

//    to add new item-- O(1)
    public boolean insert(int item){

        if(isFull()){
            System.out.println("Queue is full...");
            return false;
        }
        data[end++] =item;
        return true;
    }

//    to remove from queue -- O(n)
    public int remove(){
        if(isEmpty()){
            System.out.println("Can't remove from Queue");
            return 0;
        }
        int removed = data[0];
//        shift elems to end
        for (int i = 1; i < end; i++) {

            data[i-1] = data[i];
        }
        end--;
        return removed;
    }


//    display --- O(n)
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] +" <- ");
        }
        System.out.println("END");
    }

    public boolean isEmpty() {
        return end==0;
    }

    public boolean isFull() {
        return end == data.length;
    }


}
