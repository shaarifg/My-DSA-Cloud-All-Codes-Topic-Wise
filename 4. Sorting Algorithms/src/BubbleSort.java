import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] ar = {4, 1, 10, 4, 36, 6, -1, 11, 0, 11, -78, 78};
        bubbleSort(ar);
        System.out.println("SHarif");
        System.out.println(Arrays.toString(ar));
    }
    public static void bubbleSort(int[] input){
        boolean isSwapped = true;
        for(int i =0; i<input.length && isSwapped; i++){
            isSwapped = false;
            for (int j=1; j<=input.length-1-i; j++){
            if(input[j]<input[j-1]) {
//              Swap elements
                int temp = input[j];
                input[j] = input[j-1];
                input[j-1] = temp;
                isSwapped = true;
            }
            }
        }
    }
}
