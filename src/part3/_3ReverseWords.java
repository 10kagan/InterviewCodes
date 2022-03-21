package part3;

public class _3ReverseWords {
    public static void main(String[] args) {
        String sentence = "bir iki uc dort";
        revWords(sentence);
    }
    public static void revWords (String str){
        String [] arrStr = str.split(" ");
        String rev = "";
        for (int i = arrStr.length - 1; i >= 0; i--){
            rev += arrStr[i] + " ";
        }
        System.out.println(rev);;
    }
}
