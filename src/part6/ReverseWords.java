package part6;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "The house that Jack built";
        System.out.println(Arrays.toString(revSent(sentence)));
    }

    public static String [] revSent(String str){
        String arr[] = str.split(" ");
        int len = arr.length;

        String revSentence [] = new String[len];


        for (int i = 0; i < len; i++){
            revSentence[i] = arr[len - i - 1];
        }

        return revSentence;
    }
}
