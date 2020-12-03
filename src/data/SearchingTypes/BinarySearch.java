package data.SearchingTypes;

public class BinarySearch {
    public static void main(String[] args) {
        int a [] = {2,5,7,9,12,15,34,76,87,123};
        findTheSpecificNumber(a, 4);
    }
    public static void findTheSpecificNumber(int arr[], int target){
        int max = 10;
        int min = -1;
        int flag = 0;

        while(max-min>1){
            int median =(max + min) / 2;
            if(arr[median] == target){

                flag = 1;
                System.out.println(median);
                break;
            }else if(arr[median] < target) {
                min = median;
            }else{
                max = median;
            }
        }
        if (flag == 0){
            System.out.println("there is no number");
        }
    }
}
