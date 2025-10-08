package part11_LeetcodeString;

public class CountAsterisks {
    public static void main(String[] args) {
        String  s = "l|*e*et|c**o|*de|";
//        Output: 2
//        Explanation: The considered characters are underlined: "l|*e*et|c**o|*de|".
//                The characters between the first and second '|' are excluded from the answer.
//                Also, the characters between the third and fourth '|' are excluded from the answer.
//                There are 2 asterisks considered. Therefore, we return 2.
        System.out.println(countAsterisks(s));
    }
    public static int countAsterisks(String s) {
        if (!s.contains("*")){
            return 0;
        }
        char [] chars = s.toCharArray();
        int left = 0;
        int right = chars.length;
        int countLeft = 0;
        int countRight = 0;
        int count = 0;

        for (int i = 0; i < chars.length; i++){
            if (chars[left] == '|'){
                countLeft++;
            }
            if (chars[right - 1] == '|'){
                countRight++;
            }
            if (countLeft == 2 && countRight == 2){
                for (int j = left; j < right; j++){
                    if (chars[j] == '*'){
                        count++;
                    }
                }
            }
            left++;
            right--;
        }
        return count;
    }
}

 /*
 You are given a string s, where every two consecutive vertical bars '|' are grouped into a pair. In other words, the 1st and 2nd '|' make a pair, the 3rd and 4th '|' make a pair, and so forth.

Return the number of '*' in s, excluding the '*' between each pair of '|'.

Note that each '|' will belong to exactly one pair.
  */