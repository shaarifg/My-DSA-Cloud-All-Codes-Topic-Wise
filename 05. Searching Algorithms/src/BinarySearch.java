public class BinarySearch {
    public static void main(String[] args) {
        int[] ar ={1, 4, 5, 6, 77, 88, 99};
        int target = 77;
        System.out.println(binarySearch(ar, target));
    }
    static int binarySearch(int[] ar, int target){
        int start = 0;
        int end = ar.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if(ar[mid] < target){
                start = mid+1;
            }else if(ar[mid]>target){
                end = mid-1;
            }else return mid;
        }
        return -1;
    }
}
