package part1;

public class MaxNumberIn2DArray {
    public static void main(String[] args) {
        int [][] num = {{1,2,3},{4,5,6,7},{77,88,99,12345}};
        System.out.println(max2D(num));
    }
    public static int max2D (int [][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] each1: arr) {
            for (int each2: each1) {
                if (each2 > max)
                    max = each2;
            }
        }
        return max;
    }
}
