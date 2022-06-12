package part4.Sorting;

public class BinarySearch {
    public static int binarySearch(int [] sortedArray, int elementToBeSearched){
        int first = 0;
        int last = sortedArray.length - 1;

        while (first <= last){
            int mid = (first + last) / 2;
            if (elementToBeSearched < sortedArray[mid])
                last = mid - 1;
            else if (elementToBeSearched > sortedArray[mid])
                first = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray={12,56,74,96,112,114,123,567};
        int indexOfElementToBeSearched=binarySearch(sortedArray,74);
        System.out.println("Index of 74 in array is: " +indexOfElementToBeSearched);

        int indexOfElementToBeSearchedNotFound=binarySearch(sortedArray,7);
        System.out.println("Index of 7 in array is: " +indexOfElementToBeSearchedNotFound);
    }
}
