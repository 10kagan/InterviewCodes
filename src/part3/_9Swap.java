package part3;

public class _9Swap {
    public static void main(String[] args) {
        int swap = 1234567;
        //System.out.println(swapWithThirdVraible(swap));
        swapWithoutTemp(10,20);
    }
    public static int swapWithThirdVraible (int num){
        int result = 0;
        int c = 0;

        while (num > 0){
            c = num / 10;
            result  = result*10 + c;
        }
        return result;
    }
    public static void swapWithoutTemp (int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a +" "+ b);
    }
}
