package part4.Arrays;

import java.util.ArrayList;
import java.util.List;

public class _23Permutation {
    public static void main(String[] args) {
        _23Permutation pa=new _23Permutation();

        int[] arr= {10, 20, 30};

        List<List<Integer>> permute = pa.permute(arr);

        System.out.println("Permuations of array : [10, 20, 30] are:");
        System.out.println("=========================================");
        for(List<Integer> perm:permute)
        {
            System.out.println(perm);
        }

    }
    public List<List<Integer>> permute (int arr[]){
        List<List<Integer>> list = new ArrayList<>();
        permuteHelper(list, new ArrayList<>(), arr);
        return list;
    }

    private void permuteHelper(List<List<Integer>> list, List<Integer> resultList, int[] arr) {
        if (resultList.size() == arr.length){
            list.add(new ArrayList<>(resultList));
        }
        else {
            for (int i = 0; i < arr.length; i++){
                if (resultList.contains(arr[i])){
                    continue;
                }
                resultList.add(arr[i]);
                permuteHelper(list, resultList, arr);
                resultList.remove(resultList.size() - 1);
            }
        }
    }
}
