package Chain100Days;

import java.util.HashMap;
import java.util.Map;

public class FibonacciMemo {

    private static Map<Integer, Integer> memo = new HashMap<>();

    public static int fib(int n) {

        if (n <= 1) return n;

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int result = fib(n - 1) + fib(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fib(0));
        System.out.println(fib(1));
        System.out.println(fib(5));
        System.out.println(fib(10));
    }
}
