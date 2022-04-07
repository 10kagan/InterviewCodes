package part3;

public class _15FindTwoMaxValue {
    public static void main(String[] args) {
        int list[] = {150,20,3,4,5};
        getTwoMaxValue(list);
    }
    public static void getTwoMaxValue(int [] nums){
        int maxOne = 0;
        int maxTwo = 0;
        for (int n : nums) {
            if (maxOne < n){
                maxTwo = maxOne;
                maxOne = n;
            }else if (maxTwo < n){
                maxTwo = n;
            }
        }
        System.out.println(maxOne +", "+maxTwo);
    }
}
