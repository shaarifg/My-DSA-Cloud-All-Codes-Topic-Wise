import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int [] ar = {4, 1, 6 ,9, 7, 3, 8,2, 5};
        cyclicSort(ar);
        System.out.println(Arrays.toString(ar));

    }

    static void cyclicSort(int[] ar) {
        int i=0;
        while (i< ar.length){
            int correctIndex = ar[i]-1;
            if(ar[i] != ar[correctIndex]) swap(ar, i, correctIndex);
            else i++;
        }
    }

    public static void swap(int[] ar, int firstIndex, int secondIndex){
        int temp = ar[secondIndex];
        ar[secondIndex] = ar[firstIndex];
        ar[firstIndex] = temp;
    }

}
