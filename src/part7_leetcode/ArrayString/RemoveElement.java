package part7_leetcode.ArrayString;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {
        int [] nums = {3,2,2,3,1,5,8};
        int val = 3;
      //  Output: 2, nums = [2,2,_,_]
        System.out.println((removeElement(nums, val)));
    }
    public static List removeElement(int [] arr, int v){
        List <Integer> list = new ArrayList<>();
        for (int j = 0; j < arr.length; j++){
            if (arr[j] != v){
                list.add(arr[j]);
            }
        }
        return list;
    }
}
