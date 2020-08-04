public class Remainder {
    public static void main(String[] args) {
        System.out.println(findRemainder(30,9));
    }
    public static int findRemainder(int dividend, int divisor){
        int quotient = 0;

        while(dividend >= divisor){
            dividend -= divisor;
            quotient ++;
        }
        return quotient;
    }
}
