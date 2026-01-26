package Chain50JavaCore;

import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
    public static int[] intersection(int [] arr1, int[] arr2){
        if (arr1 == null || arr2 == null) return new int[0];

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        for (int n : arr1){
            set1.add(n);
        }

        for (int n : arr2){
            if (set1.contains(n)){
                resultSet.add(n);
            }
        }

        int [] result = new int[resultSet.size()];
        int i = 0;
        for (int n : resultSet){
            result[i++] = n;
        }

        return result;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4};
        int[] b = {2, 2, 4, 6};

        int[] res = intersection(a, b);

        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}

// Find the intersection of two arrays