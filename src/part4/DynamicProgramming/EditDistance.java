package part4.DynamicProgramming;

import java.util.Scanner;

public class EditDistance {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String s1 = scn.nextLine();
        String s2 = scn.nextLine();

        System.out.println(editDist(s1, s2));
    }

    public static int editDist(String s1, String s2) {
        int dp [][] = new int[s1.length() + 1][s2.length() + 1];
        for (int row = s2.length(); row >= 0; row--){
            dp[row][s1.length()] = s2.length() - row;
        }
        for (int col = s1.length() - 1; col >= 0; col--){
            for (int row = s2.length() - 1; row >= 0; row--){
                if (s1.charAt(col) == s2.charAt(row)){
                    dp[row][col] = dp[row + 1][col + 1];
                } else {
                    dp[row][col] = 1 + Math.min(dp[row + 1][col + 1],
                    Math.min(dp[row][col + 1],
                    dp[row + 1][col]));
                }
            }
        }
        return dp[0][0];
    }
}
