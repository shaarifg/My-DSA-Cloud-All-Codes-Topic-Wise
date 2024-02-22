package Implementation;

public class DynamicStack extends CustomStack{

    DynamicStack(int size){
        super(size); // will call the constructor of parent class that accept params
    }

    @Override
    public boolean push(int item) throws Exception {

//        if size is full then only increase size
        if(isFull()){
            int[] temp = new int[data.length*2];
            for (int i = 0; i < data.length; i++) {
                temp[i]= data[i];
            }
            data = temp;
        }
//        otherwise use method of parent class
        return super.push(item);
    }
}
