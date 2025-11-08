package Chain100Days;

public class EquilibriumIndexFinder {
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int index = findEquilibriumIndex(arr);

        if (index != -1) {
            System.out.println("Equilibrium index: " + index);
        } else {
            System.out.println("No equilibrium index found.");
        }
    }
    public static int findEquilibriumIndex(int [] arr){
        int totalSum = 0;
        for (int num: arr){
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < arr.length; i++){
            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum){
                return i;
            }
            leftSum += arr[i];
        }
        return -1; // bulunamadı
    }
}
// Find the equilibrium index in an array.