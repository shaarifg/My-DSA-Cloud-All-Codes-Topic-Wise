public class NumberOfDigitsInGivenBase {
    public static void main(String[] args) {
        int num = 1234234;
        int base = 10;
//        To get number of digits in any given number system.
        int ans = (int)(Math.log(num)/Math.log(base))+1;
//        To get number of digits in decimal number system.
        int a = (int)(Math.log10(num))+1;
        System.out.println(ans);
        System.out.println(a);
        System.out.println(123%10);
    }
}
