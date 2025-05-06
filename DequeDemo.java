import java.util.Deque;
import java.util.ArrayDeque;

public class DequeDemo {
    public static void main(String[] args) {
        // Create a Deque of Strings
        Deque<String> deque = new ArrayDeque<>();

        // ---------------------
        // Addition of elements
        // ---------------------

        deque.add("Apple");         // Adds to the end
        deque.addFirst("Banana");   // Adds to the front
        deque.addLast("Cherry");    // Adds to the end

        System.out.println("Deque after additions: " + deque); // [Banana, Apple, Cherry]

        // ---------------------
        // Deletion of elements
        // ---------------------

        String removed = deque.remove();         // Removes from front
        System.out.println("Removed using remove(): " + removed);

        String polled = deque.poll();            // Removes from front
        System.out.println("Removed using poll(): " + polled);

        String polledLast = deque.pollLast();    // Removes from end
        System.out.println("Removed using pollLast(): " + polledLast);

        System.out.println("Deque after deletions: " + deque); // []
    }
}

