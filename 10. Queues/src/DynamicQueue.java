public class DynamicQueue extends CustomQueue{

    DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean insert(int item) {
        if(isFull()){
            int[] temp = new int[data.length*2];
//            copy all the items
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.insert(item);
    }
}
