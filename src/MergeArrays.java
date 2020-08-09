import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int [] arrMer1 = {1,2,3,67};
        int [] arrMer2 = {82,4,5,6};

        System.out.println(Arrays.toString(mergeArr(arrMer1, arrMer2)));
    }
    public static int [] mergeArr (int [] arr1, int [] arr2){
        int [] mer = new int[arr1.length + arr2.length];
        for (int i = 0; i < mer.length; i++) {
            if (i < arr1.length)
                mer[i] = arr1[i];
            else
                mer[i] = arr2[i - arr1.length];
        }
        return mer;
    }
}
