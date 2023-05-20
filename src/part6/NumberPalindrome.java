package part6;

public class NumberPalindrome {
    public static boolean isPalindrome (int a){
        int pal = a;
        int reverse = 0;

        while (pal != 0){
            int remainder = pal % 10;
            reverse = reverse * 10 + remainder;
            pal = pal / 10;
        }
        return a == reverse;
    }

    public static void main(String[] args) {
        int b = 123454321;
        System.out.println("this number (" + b + ") is palindrome: " + isPalindrome(b));
    }
}
