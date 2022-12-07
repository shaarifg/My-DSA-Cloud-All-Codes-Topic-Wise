public class OrderAgnosticBinarySearch {
//    When order is unknown;
public static void main(String[] args) {
    int[] ar ={99, 88, 34, 34, 25, 16};
    int target = 16;
    System.out.println(binarySearch(ar, target));
}
    static int binarySearch(int[] ar, int target){
        int start = 0;
        int end = ar.length-1;
        boolean isAC = ar[start] < ar[end];
        while(start<=end){
            int mid = start + (end - start)/2;
            if(isAC){
                if(ar[mid] < target){
                    start = mid+1;
                }else if(ar[mid] > target){
                    end = mid-1;
                }else return mid;
            }else{
                if (ar[mid] > target) {
                    start = mid + 1;
                } else if (ar[mid] < target) {
                    end = mid - 1;
                }else return mid;
            }
        }
        return -1;
    }
}
