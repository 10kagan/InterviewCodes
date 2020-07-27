public class SwapWithoutTemp {
    public static void main(String[] args) {
        swap(10,20);
    }

    public static void swap(int num1, int num2){
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println(num1 +" " + num2);
    }
}

//Swap two variables's values without using temp variable.
