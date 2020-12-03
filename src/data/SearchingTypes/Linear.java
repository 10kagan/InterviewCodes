package data.SearchingTypes;

public class Linear {
    public static void main(String[] args) {
        int arr[] = {2,3,4,10,40};
        int target = 10;

        int result = findingElement(arr, target);
        if (result == -1)
            System.out.print(
                    "Element is not present in array");
        else
            System.out.print("Element is present at index "
                    + result);

    }
    public static int findingElement(int[] arr, int target){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}
