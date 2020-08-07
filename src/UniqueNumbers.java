public class UniqueNumbers {
    public static void main(String[] args) {
        int [] arr = {11,2,1,4,6,8,6,5,4,5,3,1,2,22,1};
        printUniqueNumbers(arr);
    }
    public static void printUniqueNumbers(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count == 1)
                System.out.print(arr[i] + " ");
        }
    }
}
