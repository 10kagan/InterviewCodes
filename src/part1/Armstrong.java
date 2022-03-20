package part1;

public class Armstrong {
    public static void main(String[] args) {

        System.out.println("Is the number armstrong? " + isArmstrong(153));

    }
    public static boolean isArmstrong(int num){
        int sum = 0;
        int temp = num;
        while (num > 0){
            int eachDigit = num % 10;
            sum += eachDigit * eachDigit * eachDigit;
            num = num /10;
        }
        if (temp == sum)
            return true;

        return false;
    }
}
