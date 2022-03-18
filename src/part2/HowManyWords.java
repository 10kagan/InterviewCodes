package part2;

public class HowManyWords {
    public static void main(String[] args) {
        System.out.println(count("How many words in this sentence, 7?"));
    }
    public static int count (String str){
        int result = 0;
        String [] arr = str.split(" ");
        for(int i = 0; i<= arr.length; i++){
            //arr[i].replace('?','');
            if(!arr[i].contains("7"))
                result++;
        }
        
        
        return result;
    }
}
