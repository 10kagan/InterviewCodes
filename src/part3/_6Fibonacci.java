package part3;

public class _6Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
    public static int fibonacci (int num){
        int result = 0;
        int a = 0;
        int b = 1;
        int c;

        for (int i = 0; i <= num; i ++){
            c = a + b;
            a = b;
            b = c;
        }
        result = b;
        return result;
    }
}
