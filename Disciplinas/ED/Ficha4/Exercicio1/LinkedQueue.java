import java.util.LinkedList;

public class LinkedQueue<T> implements QueueADT<T> {
    private LinkedList<T> elements = new LinkedList<T>();

    @Override
    public void enqueue(T element) {
        elements.addLast(element);
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements.removeFirst();
    }

    @Override
    public T first() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public String toString() {
        return elements.toString();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Queue: " + queue);
        System.out.println("Front element: " + queue.first());
        System.out.println("Queue size: " + queue.size());

        int dequeued = queue.dequeue();
        System.out.println("Dequeued element: " + dequeued);

        System.out.println("Updated Queue: " + queue);
    }
}
