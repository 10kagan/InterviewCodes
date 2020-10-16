package part1;

import java.util.Arrays;

public class RandomMaxMin {
    public static void main(String[] args) {
        maxMin();
    }
    public static void maxMin(){
        int [] num = new int[10];

        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 100);
            //System.out.println(random);
            num[i] = random;
        }
        System.out.println(Arrays.toString(num));
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int each: num) {
            if (each > max)
                max = each;
            if (each < min)
                min = each;
        }

        System.out.println("min is: " + min + " max is: " + max);
    }
}
