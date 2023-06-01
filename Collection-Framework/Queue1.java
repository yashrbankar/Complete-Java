import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements
        queue.add(10);
        System.out.println("add ::"+queue.add(30));
        System.out.println("offer :: "+queue.offer(30));

        // Dequeue elements
        int removedElement = queue.remove();
        System.out.println("Removed element: " + removedElement);

        // Peek at the front element
        int frontElement = queue.peek();
        int removedElement2 = queue.poll();
        System.out.println("Removed element poll : " + removedElement2);


        queue.isEmpty();
        System.out.println("Front element: " + frontElement);
        boolean check=queue.isEmpty();
    }
}