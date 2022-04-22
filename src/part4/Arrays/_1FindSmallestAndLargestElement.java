package part4.Arrays;

public class _1FindSmallestAndLargestElement {
    public static void main(String[] args) {
        int [] arr = new int []{1,76,403,8,3,-32,0,5};
        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++){
            if (arr[i] > largest)
                largest = arr[i];
            else if (arr[i] < smallest)
                smallest = arr[i];
        }
        System.out.println("smallest: " + smallest);
        System.out.println("largest: " + largest);
    }
}
