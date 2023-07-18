package part12_LeetcodeMath;

public class CountOfMatchesInTournament {
    public static void main(String[] args) {
        int n = 7;
//        Output: 6
//        Explanation: Details of the tournament:
//        - 1st Round: Teams = 7, Matches = 3, and 4 teams advance.
//        - 2nd Round: Teams = 4, Matches = 2, and 2 teams advance.
//        - 3rd Round: Teams = 2, Matches = 1, and 1 team is declared the winner.
//                Total number of matches = 3 + 2 + 1 = 6.
        System.out.println(numberOfMatches(n));
    }
    public static int numberOfMatches(int n) {
        int matches = 0;

        while (n > 1){
            matches += n / 2;
            n = (n + 1) / 2;
        }
        return matches;
    }
}
