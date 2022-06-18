package part4.DynamicProgramming;

import java.util.Scanner;

public class LongestCommonSubs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String A = scn.nextLine();
        String B = scn.nextLine();

        System.out.println(LCS(A, B));
    }
    public static int LCS(String a, String b) {
        int [][] db = new int[a.length() + 1][b.length() + 1];
        for (int i = 1; i < db.length; i++){
            for (int j = 1; j < db[0].length; j++){
                if (a.charAt(i - 1) == b.charAt(j - 1)){
                    db[i][j] = 1 + db[i - 1][j - 1];
                } else {
                    db[i][j] = Math.max(db[i - 1][j], db[i][j - 1]);
                }
            }
        }
        return db[a.length()][b.length()];
    }
}
