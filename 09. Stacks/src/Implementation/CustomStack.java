package Implementation;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;



    // just maintain this for all the operations, acts as index of array
   private int pointer = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        data = new int[size];
    }


    //add new item
    public boolean push(int item) throws Exception{
        if(isFull()){
            throw new Exception("Stack is full..!");
        }

        pointer++;
        data[pointer] = item;
        return true;
    }

    //remove top item and return it
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Can't remove from empty stack...what are you doing Shaarif");
        }
        return data[pointer--];
    }

    public boolean isEmpty() {
        return pointer == -1;
    }

    public boolean isFull() {
        return pointer == data.length-1;
    }


}
