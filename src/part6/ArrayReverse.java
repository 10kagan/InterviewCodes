package part6;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        String[] array = {"blah", "hey", "yo", "no"};

        System.out.println(Arrays.toString(arrRev(array)));
        System.out.println(array.length);
    }
    public static String[] arrRev(String[] arr){
        int len = arr.length;
        String strarr[] = new String[len];
        for (int i = 0; i < len; i++){
            strarr[i] = arr[len - i - 1];
        }
        return strarr;
    }
}