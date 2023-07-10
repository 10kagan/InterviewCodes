package part10_LeetcodeArrays;

public class FindMaximumNumberOfStringPairs {
    public static void main(String[] args) {
        String [] words = {"cd","ac","dc","ca","zz"};
//        Output: 2
//        Explanation: In this example, we can form 2 pair of strings in the following way:
//        - We pair the 0th string with the 2nd string, as the reversed string of word[0] is "dc" and is equal to words[2].
//                - We pair the 1st string with the 3rd string, as the reversed string of word[1] is "ca" and is equal to words[3].
//                It can be proven that 2 is the maximum number of pairs that can be formed.
        System.out.println(maximumNumberOfStringPairs(words));
    }
    public static int maximumNumberOfStringPairs(String[] words) {
        int count = 0;

        for (int i = 0; i < words.length - 1; i++){
            for (int j = i + 1; j < words.length; j++){
                if ((words[i].substring(0,1).equals(words[j].substring(1,2)) && ((words[i].substring(1,2).equals(words[j].substring(0,1)))))){
                    count++;
                }
            }
        }
        return count;
    }
}
