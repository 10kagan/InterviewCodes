import java.util.Arrays;

public class FindShorthestWordInArray {
    public static void main(String[] args) {
        String [] arr = {"tsubasa","Hyuga","Misagi","Wakashimazu"};
        System.out.println(Arrays.asList(arr));
        System.out.println(shortestWord(arr));
    }
    public static String shortestWord(String [] strArr){
        String shortestWord = strArr[0];

        for(int i = 0; i < strArr.length; i++) {
            if(strArr[i].length() < shortestWord.length())
                shortestWord = strArr[i];
        }
        return shortestWord;
    }
}
