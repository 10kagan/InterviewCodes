import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FilterDuplicateElements {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("kenzo");
        al.add("ozora");
        al.add("hyuga");
        al.add("cok bilmis");
        al.add("kenzo");
        al.add("2");

        for (int i = 1; i < 5; i++) {
            al.add(String.valueOf(i));
        }

        System.out.println(deleteDuplicateElementsInArray(al));
    }
    public static Set<String> deleteDuplicateElementsInArray(List<String> ContainDuplicate){
        final Set<String> resultSet = new HashSet<>();
        for (String each: ContainDuplicate) {
            if (!resultSet.contains(each))
                resultSet.add(each);
        }
        return resultSet;
    }
}
