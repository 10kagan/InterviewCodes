package part7_leetcode.ArrayString;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int [] nums2 = {2,5,6};
        int n = 3;

        System.out.println(Arrays.toString(mergeSortedArray(nums1,m,nums2,n)));
    }
    public static int[] mergeSortedArray(int nums1[], int m, int nums2[], int n){
        int [] mer = new int [m+n];

        for(int i = 0; i < m; i++){
            mer [i] = nums1[i];
        }

        for(int j = 0; j < n; j++){
            mer [m+j] = nums2[j];
        }
        Arrays.sort(mer);
        return mer;
    }
}
