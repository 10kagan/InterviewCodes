public class StairCase {
    public static void main(String[] args) {
        makeStairCase1(4);
        makeStairCase2(4);
    }
    public static void makeStairCase1(int num){
        for (int i = 0; i < num; i++) {
            for (int j = i; j < num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void makeStairCase2(int num){
        for (int i = num; i > 0; i--) {
            for (int j = i -1 ; j < num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
