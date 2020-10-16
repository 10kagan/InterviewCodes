package part1;

import java.util.Scanner;

public class SumToForty {
    public static void main(String[] args) {
        sumTo40();
    }
    public static void sumTo40(){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while (sum < 40){
            System.out.println("enter number");
            int num = scan.nextInt();
            sum = sum + num;
            if(sum >= 40)
                break;
            System.out.println("keep entering");
        }
        System.out.println(sum);
    }
}
