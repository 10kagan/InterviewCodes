package part11_LeetcodeString;

public class PercentageOfLetterInString {
    public static void main(String[] args) {
        String s = "foobar";
        char letter = 'o';
//        Output: 33
//        Explanation:
//        The percentage of characters in s that equal the letter 'o' is 2 / 6 * 100% = 33% when rounded down, so we return 33.
        System.out.println(percentageLetter(s, letter));
    }
    public static int percentageLetter(String s, char letter) {
        int count = 0;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == letter){
                count++;
            }
        }
        return  (count*100)/s.length();
    }
}
