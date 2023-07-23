package part11_LeetcodeString;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity {
    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();
        List<String> path1 = new ArrayList<>();
        List<String> path2 = new ArrayList<>();
        List<String> path3 = new ArrayList<>();
        path1.add("London");
        path1.add("New York");
        paths.add(path1);
        path2.add("New York");
        path2.add("Lima");
        paths.add(path2);
        path3.add("Lima");
        path3.add("Sao Paulo");
        paths.add(path3);
//        Output: "Sao Paulo"
//        Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".
        System.out.println(destCity(paths));
    }
    public static String destCity(List<List<String>> paths) {
        Set<String> sourceCities = new HashSet<>();
        Set<String> destinationCities = new HashSet<>();

        for (List<String> path : paths) {
            sourceCities.add(path.get(0));
            destinationCities.add(path.get(1));
        }

        for (String destination : destinationCities) {
            if (!sourceCities.contains(destination)) {
                return destination;
            }
        }
        return "";
    }
}


 /*
 You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.

It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.



Example 1:

Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
Output: "Sao Paulo"
Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".
  */