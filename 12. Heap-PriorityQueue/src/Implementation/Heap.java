package Implementation;

import java.util.ArrayList;
import java.util.Comparator;


//Max Heap
public class Heap<T extends Comparator<T>> {

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
        if(list.get(index).compareTo(list.get(p))<0){

        };
    }


}
