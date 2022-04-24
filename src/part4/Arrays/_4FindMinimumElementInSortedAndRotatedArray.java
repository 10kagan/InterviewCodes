package part4.Arrays;

public class _4FindMinimumElementInSortedAndRotatedArray {
    public static void main(String[] args) {
        int arr[]={16,19,21,25,1,5,8,10};
        System.out.println(findMinimumElement(arr,0, arr.length-1));
    }
    public static int findMinimumElement(int[] arr,int low,int high){
        int mid;
        while (low < high){
            mid = low + ((high - low) / 2);
            if (arr[mid] > arr[high])
                low = mid + 1;
            else
                high = mid;
        }
        return arr[low];
    }
}
