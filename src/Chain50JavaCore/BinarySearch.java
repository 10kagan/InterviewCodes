package Chain50JavaCore;

public class BinarySearch {

    public static int binarySearch(int [] arr, int target){
        if (arr == null || arr.length == 0) return  -1;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) return mid;

            if (arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9, 11};

        System.out.println(binarySearch(nums, 7));  // 3
        System.out.println(binarySearch(nums, 4));  // -1
    }
}

// Implement binary search in a sorted array