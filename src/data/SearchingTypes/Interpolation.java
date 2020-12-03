package data.SearchingTypes;

public class Interpolation {
    public static void main(String[] args) {
        int [] arr = {10, 12, 13, 16, 18, 19, 20, 21, 22, 23,24, 33, 35, 42, 47};
        int target = 13;
        System.out.println(findNumber(arr, target));
    }
    public static int findNumber(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;

        while (low <= high && target >= arr[low] && target <= arr[high]){
            if (low == high){
                if (arr[low] == target)
                    return low;
                return -1;
            }
            int position = low + (((high - low) /
                    (arr[high] - arr[low])) * (target - arr[low]));
            if (arr[position] == target)
                return position;
            if (arr[position] < target)
                low = position + 1;
            else
                high = position - 1;
        }
        return -1;
    }
}
