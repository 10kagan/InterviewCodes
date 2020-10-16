package part1;

public class Round {
    public static void main(String[] args) {
        System.out.println(round(100188));
    }
    public static int round(int num){
        int count = 0;
        while (num > 0){
            num = num / 10;
            count ++;
        }
        return count;
    }
}
