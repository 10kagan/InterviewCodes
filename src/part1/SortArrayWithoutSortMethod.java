package part1;

import java.util.Arrays;

public class SortArrayWithoutSortMethod {
    public static void main(String[] args) {
        sortArray(new int[] {12,3,44,63,8});
        int a =3;
        int b =5;
        System.out.println(func(a,b));

        int x =315;
        int y = 840;
           x%=y;
           y%=x;
        System.out.println(x);
        System.out.println(y);
    }
    public static Integer func(Integer a, Integer b)  {
        if(b==0)
            return 1;
        Integer temp = func(a,b/2);
        if (b%2 !=0)
            return temp * temp * a;
        else
            return temp * temp;
    }
    public static void swap (int num1, int num2){
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

       // System.out.println(num1, num2);
    }

    public static void sortArray(int [] arr){
//        for (int i = 0 ; i < arr.length; i++){
//            for (int j = 0; j < arr.length - 1; j++){
//
//                if (arr[j] > arr[j + 1]){
//                    int temp = arr[j];
//                    arr [j] = arr[j + 1];
//                    arr [j + 1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
    }
}


//4.Write a method where u sort an Array int[] without using the sort method
