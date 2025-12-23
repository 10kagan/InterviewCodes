package Chain100Days;

import java.util.*;

public class GraphDFS {

    public static List<Integer> dfsIterative(Map<Integer, List<Integer>> graph, int start){
        List<Integer> order = new ArrayList<>();
        if (graph == null || !graph.containsKey(start)) return order;

        Set<Integer> visited = new HashSet<>();
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(start);

        while (!stack.isEmpty()){

            int node = stack.pop();

            if (visited.contains(node)) continue;
            visited.add(node);
            order.add(node);

            List<Integer> neighbors = graph.getOrDefault(node, Collections.emptyList());
            for (int i = neighbors.size() - 1; i >= 0; i--){
                int nei = neighbors.get(i);
                if (!visited.contains(nei)){
                    stack.push(nei);
                }
            }

        }
        return order;
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(0, Arrays.asList(1,2));
        graph.put(1, Arrays.asList(3,4));
        graph.put(2, Arrays.asList(5));
        graph.put(3, Arrays.asList());
        graph.put(4, Arrays.asList(5));
        graph.put(5, Arrays.asList());

        System.out.println(dfsIterative(graph, 0));
    }
}

// Implement depth-first search on a graph