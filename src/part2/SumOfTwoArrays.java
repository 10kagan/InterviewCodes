package part2;

public class SumOfTwoArrays {

    // we have an integer value, it should be equal sum of pair of arr values
    public static void main(String[] args) {
        int[]arr1 = {1,2,3,4,5,6,7};
        int[]arr2 = {2,3,4};
        System.out.println(Sum(arr1, arr2,12));
    }
    public static boolean Sum(int[]x, int[]y, int z){
        boolean result = false;
        for (int i =0; i<=x.length-1; i++){
            for(int j =0; j<=y.length-1; j++){
                int sumArr = x[i] + y[j];
                if(z == sumArr)
                    result = true;
            }
        }
        return result;
    }
}
