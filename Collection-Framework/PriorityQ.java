import java.util.*;

public class PriorityQ 
{
    public static void main(String Args[])
    {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        // maxHeap
        PriorityQueue<Integer>pq2=new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(-1);
        pq.add(0);
        pq.remove();
        pq.isEmpty();
        int val=pq.peek();
        System.out.println("top: "+val);

    }
}
