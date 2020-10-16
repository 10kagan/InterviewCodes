package part1;

public class SumOfAllDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(9073));
    }
    public static int sumDigits(int num){
        int result = 0;
        while (num > 0){
            result += num % 10;
            num = num / 10;
        }
        return result;
    }
}
