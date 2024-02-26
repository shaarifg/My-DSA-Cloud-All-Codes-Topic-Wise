public class CircularQueue {
//    helps to optimize the time complexity
    protected int[] data;
    protected static final int DEFAULT_SIZE = 10;
    private int front = 0;
    private int end = 0;
    private int size = 0;

    CircularQueue(){
        this(DEFAULT_SIZE);
    }
    CircularQueue(int size){
        data = new int[size];
    }



//    insert new item
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }


//    remove element;
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
             return 0;
        }
        int removed = data[front++];
        front = front% data.length;
        size--;
        return removed;
    }

//    public  void display(){
//
//        do{
//            System.out.print(data[front]);
//
//        }
//    }

    private boolean isEmpty() {
        return size == 0;
    }

    private boolean isFull() {
    return size == data.length;
    }

}
