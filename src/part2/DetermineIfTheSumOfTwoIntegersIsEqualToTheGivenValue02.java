package part2;

public class DetermineIfTheSumOfTwoIntegersIsEqualToTheGivenValue02 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        test(6, nums );
    }
    public static void test(int target, int[]arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (target == arr[i] + arr[j])
                    System.out.println(arr[i] + arr[j]);
                    count ++;
            }
        }
        System.out.println(count);
    }
}
