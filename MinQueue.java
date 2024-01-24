import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MinQueue<T extends Comparable<T>> {
    private Queue<T> queue; // Queue to store elements
    private Deque<T> minDeque; // Deque to keep track of minimum element

    // Constructor to initialize the queue and deque
    public MinQueue() {
        queue = new LinkedList<>();
        minDeque = new LinkedList<>();
    }

    // Method to add an element to the queue
    public void add(T x) {
        queue.add(x); // Add element to queue

        // Remove all elements from the back of the deque that are larger than the new element
        while (!minDeque.isEmpty() && minDeque.peekLast().compareTo(x) > 0) {
            minDeque.removeLast();
        }
        // Add the new element to the back of the deque
        minDeque.addLast(x);
    }

    // Method to remove the first element from the queue
    public T remove() {
        T x = queue.remove(); // Remove element from queue

        // If the removed element was the minimum element, remove it from the front of the deque
        if (x.equals(minDeque.peekFirst())) {
            minDeque.removeFirst();
        }
        return x;
    }

    // Method to return the minimum element in the queue
    public T min() {
        return minDeque.peekFirst(); // Return the element at the front of the deque, which is the minimum element
    }

    // Method to return the size of the queue
    public int size() {
        return queue.size();
    }

}
