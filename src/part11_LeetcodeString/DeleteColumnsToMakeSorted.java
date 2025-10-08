package part11_LeetcodeString;

import java.util.Arrays;

public class DeleteColumnsToMakeSorted {
    public static void main(String[] args) {
        String [] strs = {"cba","daf","ghi"};
//        Output: 1
//        Explanation: The grid looks as follows:
//        cba
//        daf
//        ghi
//        Columns 0 and 2 are sorted, but column 1 is not, so you only need to delete 1 column.
        System.out.println(minDeletionSize(strs));
    }
    public static int minDeletionSize(String[] strs) {
        int count = 0;

        for (int i = 0; i < strs[0].length(); i++){
            String [] arr = new String[strs.length];{
                for (int j = 0; j < strs.length; j++){
                    arr[j] = String.valueOf(strs[j].charAt(i));
                }
            }
            System.out.println(Arrays.toString(arr));

            String[] sortedArr = arr.clone();
            Arrays.sort(sortedArr);
            if (!Arrays.equals(arr, sortedArr)) {
                count++;
            }
        }
        return count;
    }
}
