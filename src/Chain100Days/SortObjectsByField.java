package Chain100Days;

import java.util.Arrays;
import java.util.List;

public class SortObjectsByField {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        );

        people.sort((p1, p2) ->  Integer.compare(p1.age, p2.age));
        System.out.println(people);
    }
}
class Person{
    String name;
    int age;

    Person (String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

// Sort a list of objects by a field using Lambda

// Time Complexity: O(n log n)