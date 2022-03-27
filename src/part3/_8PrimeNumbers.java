package part3;

public class _8PrimeNumbers {
    public static void main(String[] args) {
        int i = 7;
        System.out.println(isPrime(i));
    }
    public static boolean isPrime (int num){
        if(num == 0  || num == 1){
            return false;
        }
        if(num == 2){
            return true;
        }
        for (int i = 2; i <= num/2; i++ ){
            if(num % i == 0)
                return false;
        }
        return true;
    }
}

//    public static boolean isPrime(int n) {
//        for (int i = 2; i <= n / 2; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
