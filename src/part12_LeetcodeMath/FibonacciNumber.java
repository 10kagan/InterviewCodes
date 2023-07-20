package part12_LeetcodeMath;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
//1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610