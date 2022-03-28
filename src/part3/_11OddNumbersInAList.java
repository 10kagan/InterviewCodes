package part3;

import java.util.ArrayList;
import java.util.List;

public class _11OddNumbersInAList {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(44444445);
        System.out.println(numList);
        System.out.println(isOnlyOddNumbers(numList));
    }
    public static boolean isOnlyOddNumbers(List<Integer> lst){
        for (int num: lst) {
            if (num % 2 == 0)
                return false;
        }
        return true;
    }
}
