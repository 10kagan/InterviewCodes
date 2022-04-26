package part4.Arrays;

public class _8FindAPairSumClosestZero {
    public static void main(String[] args) {
        int array[]={1,3,-5,7,8,20,-40,6};
        findMinPair(array);
    }
    public static void findMinPair(int arr[]){
        if (arr.length < 2)
            return;

        int minimumSum = arr[0] + arr[1];
        int pair1stindex = 0;
        int pair2ndindex = 1;

        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                int tempSum = arr[i] + arr[j];
                if (Math.abs(tempSum) < Math.abs(minimumSum)){
                    pair1stindex = i;
                    pair2ndindex = j;
                    minimumSum = tempSum;
                }
            }
        }
        System.out.println(pair1stindex +"    "+ pair2ndindex);
        System.out.println(arr[pair1stindex] +"    "+ arr[pair2ndindex]);
    }
}
