package part4.Arrays;

public class _3FindElementInSortedAndRotatedArray {
    public static void main(String[] args) {
        int arr[]={16,19,21,25,3,5,8,10};
        System.out.println(findElement(arr,0, arr.length -1, 3));
    }
    public static int findElement(int arr[], int low, int high, int number){
        int mid;
        while (low <= high){
            mid = low + ((high - low)/2);
            // mid = 4
            if (arr[mid] == number)
                return mid;
            if (arr[mid] <= arr[high]){
                if (number > arr[mid] && number <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }else {
                if (arr[low] <= number && number < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
        }
        return -1;
    }
}
