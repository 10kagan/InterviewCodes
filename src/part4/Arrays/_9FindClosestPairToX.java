package part4.Arrays;

public class _9FindClosestPairToX {
    public static void main(String[] args) {
        int array[]={-40,-5,1,3,6,7,8,20};
        findPairWithClosestToXBruteForce(array, -30);
    }
    public static void findPairWithClosestToXBruteForce(int arr[], int x){
        if (arr.length < 2)
            return;
        int minDiff = Math.abs(arr[0]+arr[1]-x);
        int pair1stIndex = 0;
        int pair2ndIndex = 1;
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                int tempDiff = Math.abs(arr[i]+arr[j]-x);

                if (tempDiff < minDiff){
                    pair1stIndex = i;
                    pair2ndIndex = j;
                    minDiff = tempDiff;
                }
            }
        }
        System.out.println(" The pair whose sum is closest to X using brute force method: "+arr[pair1stIndex]+" "+ arr[pair2ndIndex]);
    }
}
