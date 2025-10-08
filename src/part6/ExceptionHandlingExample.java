package part6;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Exception handling code
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Cleanup or resource releasing code
            System.out.println("Cleanup operations");
        }
    }

    public static int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return num1 / num2;
    }
}
