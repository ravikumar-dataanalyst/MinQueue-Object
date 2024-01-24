public class Main {
    public static void main(String[] args) {
        // Create a new MinQueue object of Integer type
        MinQueue<Integer> minQueue = new MinQueue<>();

        // Add some elements to the queue
        minQueue.add(5);
        minQueue.add(3);
        minQueue.add(7);
        minQueue.add(2);

        // Print the current minimum element and size of the queue
        System.out.println("Current minimum element: " + minQueue.min());
        System.out.println("Size of the queue: " + minQueue.size());

        // Remove an element from the queue
        minQueue.remove();

        // Print the updated minimum element and size of the queue
        System.out.println("Current minimum element: " + minQueue.min());
        System.out.println("Size of the queue: " + minQueue.size());
    }
}