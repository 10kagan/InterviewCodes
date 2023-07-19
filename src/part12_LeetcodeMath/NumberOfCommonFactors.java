package part12_LeetcodeMath;

public class NumberOfCommonFactors {
    public static void main(String[] args) {
        int a = 12, b = 6;
//        Output: 4
//        Explanation: The common factors of 12 and 6 are 1, 2, 3, 6.
        System.out.println(commonFactors(a, b));
    }

    public static int commonFactors(int a, int b) {
        int c = Math.min(a,b);
        int count = 0;
        for (int i = 1; i <= c; i++){
            if (a % i == 0 && b % i == 0){
                count++;
            }
        }
        return count;
    }
}
