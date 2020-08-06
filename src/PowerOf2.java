public class PowerOf2 {
    public static void main(String[] args) {
        powerOf2(1024);
    }
    public static void powerOf2(int num){
        if (num < 2){
            System.out.println(num + " is small than 2");
            System.exit(0);
        }
        int count = num;
        while (count % 2 == 0){
            count = count / 2;
        }

        System.out.println(num);

        if (count != 1)
            System.out.println(num +" is not power of 2");
        else
            System.out.println(num +" is power of 2");
    }
}
