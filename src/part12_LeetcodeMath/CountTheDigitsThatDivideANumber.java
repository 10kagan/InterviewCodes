package part12_LeetcodeMath;

public class CountTheDigitsThatDivideANumber {
    public static void main(String[] args) {
        int num = 1248;
//        Output: 4
//        Explanation: 1248 is divisible by all of its digits, hence the answer is 4.
        System.out.println(countDigits(num));
    }
    public static int countDigits(int num) {
        int count = 0;
        int n = num;
        while (n > 0){
            int digit = n % 10;
            n = n / 10;
            if (num % digit == 0){
                count++;
            }
        }
        return count;
    }
}
