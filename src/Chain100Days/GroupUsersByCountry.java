package Chain100Days;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupUsersByCountry {
    public static void main(String[] args) {
        List<User> user = Arrays.asList(
                new User("Alice", "USA"),
                new User("Bob", "Canada"),
                new User("Charlie", "USA"),
                new User("David", "Canada"),
                new User("Elif", "Turkey")
        );

        Map<String, List<User>> grouped = groupByCountry(user);
        grouped.forEach((country, list) ->
                System.out.println(country + " → " + list));
    }

    public static Map<String, List<User>> groupByCountry (List<User> users){
        return users.stream()
                .collect(Collectors.groupingBy(u -> u.country));
    }
}

class User{
    String name;
    String country;

    User (String name, String country){
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString(){
        return name + " (" + country + ")";
    }
}

// Group a list of users by their country using Collectors

// Time Complexity: O(n)