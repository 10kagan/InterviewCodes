import java.util.LinkedList;
import java.util.List;

public class IntersectionTwoArrays {
    public static void main(String[] args) {
        int [] arr1 = {0,1,2,3,4,5,6,7,8};
        int [] arr2 = {0,2,4,6,8,10,12,14};

        System.out.println(findIntersectionOfTwoArrays(arr1, arr2));
    }
    public static List<Integer> findIntersectionOfTwoArrays(int [] num1, int [] num2){
        List <Integer>lst = new LinkedList<Integer>();

        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num2.length; j++) {
                if (num1[i] == num2[j])
                    lst.add(num1[i]);
            }
        }
        return lst;
    }
}
