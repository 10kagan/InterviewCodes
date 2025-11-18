package Chain100Days;

import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 4, 6};

        int[] result = intersection(arr1, arr2);

        for (int val : result){
            System.out.print(val + " ");
        }
    }
    public static int [] intersection (int [] arr1, int arr2 []){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        for (int num : arr1){
            set1.add(num);
        }

        for (int num : arr2){
            if (set1.contains(num)){
                resultSet.add(num);
            }
        }
        int [] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet){
            result[i++] = num;
        }
        return result;
    }
}

// Find the intersection of two arrays.