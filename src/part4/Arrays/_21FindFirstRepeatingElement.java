package part4.Arrays;

import java.util.HashSet;

public class _21FindFirstRepeatingElement {
    public static void main(String[] args) {
        int array[] = {10, 7, 8, 1, 8, 7, 6};
        int rep = getFirstRepeatingElementArray(array);
        if (rep != -1)
            System.out.println("The first repeating element in array is: " + array[rep]);
        else
            System.out.println("There are no repeating elements");     }
    public static int getFirstRepeatingElementArray(int arr[]){
        int minimumIndex = -1;
        HashSet<Integer> set = new HashSet<>();
        for (int i = arr.length - 1; i >= 0; i--){
            if (set.contains(arr[i]))
                minimumIndex = i;
            else
                set.add(arr[i]);
        }
        return minimumIndex;
    }
}
