package part12_LeetcodeMath;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public static void main(String[] args) {
        int n = 234;
//        Output: 15
//        Explanation:
//        Product of digits = 2 * 3 * 4 = 24
//        Sum of digits = 2 + 3 + 4 = 9
//        Result = 24 - 9 = 15
        System.out.println(subtractProductAndSum(n));
    }
    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while (n > 0){
            int remain = n % 10;
            sum += remain;
            product = product * remain;
            n = n / 10;
        }
        return product - sum;
    }
}
