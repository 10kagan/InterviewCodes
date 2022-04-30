package part4.Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class _15CountFrequencyInArray {
    //complexity: O(n*log(n))
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        System.out.print("arr[]: {");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
        System.out.println(" }");
        HashMap<Integer, Integer> freqMap = solveIterative(arr);

        for(int val : freqMap.keySet()) {
            System.out.println("Frequency of " + val + " is : " + freqMap.get(val));
        }
    }

    private static HashMap<Integer, Integer> solveIterative(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int val: arr){
            if (!freqMap.containsKey(val))
                freqMap.put(val,1);
            else
                freqMap.put(val, freqMap.get(val)+1);
        }
        return freqMap;
    }
}
