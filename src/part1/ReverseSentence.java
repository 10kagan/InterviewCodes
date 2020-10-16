package part1;

public class ReverseSentence {
    public static void main(String[] args) {
        System.out.println(reverse("Tsubasa Ozoro aaa aaa bbb ccc"));
    }

    public static String reverse(String str){
        String result = "";

        String [] arr = str.split(" ");
        for (int i = arr.length -1; i >= 0; i--){
            result += arr[i] + " ";
        }
        return result;
    }
}
