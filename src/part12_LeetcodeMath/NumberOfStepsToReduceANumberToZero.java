package part12_LeetcodeMath;

public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        int num = 123;
//        Output: 6
//        Explanation:
//        Step 1) 14 is even; divide by 2 and obtain 7.
//        Step 2) 7 is odd; subtract 1 and obtain 6.
//        Step 3) 6 is even; divide by 2 and obtain 3.
//        Step 4) 3 is odd; subtract 1 and obtain 2.
//        Step 5) 2 is even; divide by 2 and obtain 1.
        System.out.println(numberOfSteps(num));
    }
    public static int numberOfSteps(int num) {
        int step = 0;
        while (num > 0){
            if(num%2 == 0){
                num = num / 2;
                step++;
            } else {
                num = num - 1;
                step++;
            }
        }
        return step;
    }
}
