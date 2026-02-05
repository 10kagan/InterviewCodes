package Chain50JavaCore;

import java.util.Arrays;

public class MergeSortedArrays {
    public static int[] merge(int [] a, int [] b){
        if (a == null) return b;
        if (b == null) return a;

        int[] result = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        while (i < a.length) {
            result[k++] = a[i++];
        }

        while (j < b.length) {
            result[k++] = b[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};

        System.out.println(Arrays.toString(merge(a, b)));
    }
}

// Merge two sorted arrays into one sorted array