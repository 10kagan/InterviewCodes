package part4.Arrays;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

public class _6FindOddTimesElementInArray {
    //complexity o(n*n)
    public static void main(String[] args) {
        int array[] = new int[]{20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20, 20};
        System.out.println(getOddTimesElementHashing(array));
    }
    public static int getOddTimesElementHashing(int arr []){
        HashMap<Integer, Integer> elements = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            int element = arr[i];
            if (elements.get(element) == null){
                elements.put(element,1);
            }else
                elements.put(element, elements.get(element)+1);
        }
        for (Map.Entry<Integer, Integer> entry : elements.entrySet()){
            if (entry.getValue() %2 == 1)
                return entry.getKey();
        }
        return -1;
    }
}
