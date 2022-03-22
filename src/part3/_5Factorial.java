package part3;

public class _5Factorial {
    public static void main(String[] args) {
        int fac = 4;
        System.out.println(factorial(fac));
    }
    public static int factorial (int i){
        if (i<2)
            return 1;
        else
            return factorial(i - 1 ) * i;
    }
}
