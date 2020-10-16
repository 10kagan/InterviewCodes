package part1;

public class ReverseWord {
    public static void main(String[] args) {
        System.out.println(reverse2("ali ipe kos"));
    }

    public static String reverse2 (String str){

        String result = "";
        String [] arr = str.split(" ");
        int arrlength = arr.length;

        for (int i=0; i<arrlength; i++){

            String word= "";
            String [] arr1= arr[i].split("");

            for(int j=0; j<arr1.length; j++){
                word += arr1 [arr1.length - j - 1];
            }

            result += word + " ";
        }

        return result;

    }

    public static String reverse(String str){
        String result = "";
        String [] arr = str.split("");
        for (int i = 0; i < arr.length ; i++){
            result += arr[arr.length - i-1];
        }

        return result;
    }

}
