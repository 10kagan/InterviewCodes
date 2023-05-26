package part6;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate element, not added

        System.out.println(fruits); // Output: [Orange, Banana, Apple]

        boolean containsBanana = fruits.contains("Banana");
        System.out.println(containsBanana); // Output: true

        fruits.remove("Orange");
        System.out.println(fruits); // Output: [Banana, Apple]

        int size = fruits.size();
        System.out.println(size); // Output: 2

    }
}