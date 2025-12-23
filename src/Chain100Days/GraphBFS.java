package Chain100Days;

import java.util.*;

public class GraphBFS {
    public static List<Integer> bfs (Map<Integer, List<Integer>> graph, int start){
        List<Integer> order = new ArrayList<>();
        if (graph == null || graph.containsKey(start)) return order;

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new ArrayDeque<>();

        while (!queue.isEmpty()){
            int node = queue.poll();
            order.add(node);

            for (int nei : graph.getOrDefault(node, Collections.emptyList())){
                if (!visited.contains(nei)){
                    visited.add(nei);
                    queue.offer(nei);
                }
            }
        }
        return order;
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(0, Arrays.asList(1,2));
        graph.put(1, Arrays.asList(3, 4));
        graph.put(2, Arrays.asList(5));
        graph.put(3, Arrays.asList());
        graph.put(4, Arrays.asList(5));
        graph.put(5, Arrays.asList());

        System.out.println(bfs(graph, 0));
    }
}

// Implement breadth-first search on a graph