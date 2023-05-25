package part6;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println(names); // Output: [Alice, Bob, Charlie]

        String secondName = names.get(1);
        System.out.println(secondName); // Output: Bob

        names.remove(0);
        System.out.println(names); // Output: [Bob, Charlie]

        int size = names.size();
        System.out.println(size); // Output: 2

    }
}