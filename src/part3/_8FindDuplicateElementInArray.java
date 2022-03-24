package part3;

import java.util.*;

public class _8FindDuplicateElementInArray {
    public static void main(String[] args) {
        String str = "findduplicateelements";
        String str2 = "eece";
        String str3 = "aaff";
        duplicate(str3);
    }
    public static void duplicate (String s){
        String [] arr = s.split("");
        ArrayList<String> list = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++){
            for (int j = i +1; j < s.length(); j++){
                if (arr[i].equals(arr[j]))
                    list.add(arr[i]);
                    count++;
            }
        }
        System.out.println(count);
        System.out.println(list);
    }
}
