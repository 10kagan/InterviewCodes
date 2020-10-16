package part1;

public class PlusMinus {
    public static void main(String[] args) {
        int [] ar = {0 , -2, 4};
        plusMinus(ar);
    }

    public static void plusMinus(int[] arr) {
        float result = 0;
        for (float num: arr){
            if (num > 0){
                result = num/arr.length;
                System.out.printf("%.6f %n",result);
            }
        }
    }
}
