package part10_LeetcodeArrays;

public class NumberOfSeniorCitizens {
    public static void main(String[] args) {
        String [] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
//        Output: 2
//        Explanation: The passengers at indices 0, 1, and 2 have ages 75, 92, and 40. Thus, there are 2 people who are over 60 years old.
        System.out.println(countSeniors(details));
    }
    public static int countSeniors(String[] details) {
        int count = 0;

        for (int i = 0; i < details.length; i++){
            String temp = details[i].substring(11,13);
            int age = Integer.parseInt(temp);
            if (age > 60){
                count++;
            }
        }
        return count;
    }
}
