package part4.DynamicProgramming;

import java.util.Scanner;

public class CoinChange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] currencies = new int[scn.nextInt()];

        for (int i = 0; i < currencies.length; i++){
            currencies[i] = scn.nextInt();
        }
        int amount = scn.nextInt();
        System.out.println(
                "Number of ways we can pay using given currencies are : " +
                        coinchange(0, amount, currencies, ""));
    }

    public static int coinchange(int ci, int remaining, int[] currencies, String paid) {
        if (remaining == 0){
            System.out.println(paid);
            return 1;
        }
        if (remaining < 0){
            return 0;
        }
        int res = 0;
        for (int i = ci; i < currencies.length; i++){
            res += coinchange(i, remaining - currencies[i], currencies,
                    paid + Integer.toString(currencies[i]) + ",");
        }
        return res;
    }
}
