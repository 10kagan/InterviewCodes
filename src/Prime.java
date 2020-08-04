public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(888));
    }
    public static boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }
        for(int i = 0; i < Math.sqrt(num); i++){
            if(i % 2 == 0)
                return false;
        }
        return true;
    }
}
