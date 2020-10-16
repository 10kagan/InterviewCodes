package part1;

public class FindMissingNumber {
    public static void main(String[] args) {
        System.out.println(findMissingNumber(new int[] {1,2,4,5,6,7,8,9,10}));
    }
    public static int findMissingNumber(int [] arr){
        int result = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] + 1 != arr[i + 1])
                result = arr[i] + 1;
        }

        return result;
    }
}
