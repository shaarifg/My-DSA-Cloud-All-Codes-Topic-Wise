public class EvenOdd {
    public static void main(String[] args) {
        int num = 72;
        System.out.println(checkEvenOdd(num)?"Odd":"Even");
//        System.out.println((num & 1) == 1?"Odd":"Even");
    }

    private static boolean checkEvenOdd(int num) {
        return (num & 1) == 1;
    }
}
