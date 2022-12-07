import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] ar = {4, 1, 6 ,9, 7, -1, 8};
        selectionSort(ar);
        System.out.println(Arrays.toString(ar));
    }

    private static void selectionSort(int[] ar) {
        for(int i=0; i<ar.length; i++){
            int last  = ar.length -1-i;
            int maxIndex = getMaxIndex(ar, 0, last);
            swap(ar, maxIndex, last);
        }
    }

    private static int getMaxIndex(int[] ar, int start, int last) {
        int max = start;
        for(int i =0; i<= last; i++){
            if(ar[max] < ar[i]){
               max=i;
            }
        }
        System.out.println(max);
        return max;
    }
    public static void swap(int[] ar, int firstIndex, int secondIndex){
        int temp = ar[secondIndex];
        ar[secondIndex] = ar[firstIndex];
        ar[firstIndex] = temp;
    }
}
