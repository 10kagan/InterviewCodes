package part4.Arrays;

// complexity O(n)
public class _20CountElementSortedBinaryArray {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1,1,1,2,2};
        System.out.println(countElement(arr));
    }
    public static int countElement (int arr[]){
        int currPointter = 0;
        while (currPointter < arr.length){
            if (arr[currPointter] == 2){
                break;
            }
            currPointter++;
        }
        return (arr.length - currPointter);
    }
}
