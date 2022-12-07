public class OnlyOnceInArray {
//   Find Unique element in Arrays.
    public static void main(String[] args) {
        int[] ar = {1,2,6, 3,3, 2, 1, 4, 4, 7};
//        XOR all the elements
        int unique  = 0;
        for(int n:ar){
            unique ^= n;
            System.out.println(unique);
        }
        System.out.println(unique);
    }
}
