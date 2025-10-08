package part6;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        System.out.println(queue); // Output: [Alice, Bob, Charlie]

        String frontElement = queue.peek();
        System.out.println(frontElement); // Output: Alice

        String removedElement = queue.poll();
        System.out.println(removedElement); // Output: Alice

        System.out.println(queue); // Output: [Bob, Charlie]
    }
}
