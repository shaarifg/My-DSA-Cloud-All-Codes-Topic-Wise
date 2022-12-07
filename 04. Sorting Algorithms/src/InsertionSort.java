import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] ar = {4, 1, 6 ,9,0, 7, -1, 8,-111};
        insertionSort(ar);
        System.out.println(Arrays.toString(ar));
    }

    private static void insertionSort(int[] ar) {
        for(int i = 0; i< ar.length-1; i++){
            for(int j= i+1; j>0; j--){
                if(ar[j] < ar[j-1]){
//                    Swap elements in ascending order
                    int temp = ar[j];
                    ar[j] =  ar[j-1];
                    ar[j-1] = temp;
                }else break;
            }
        }
    }
}
