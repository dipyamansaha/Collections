// PriorityQueue/Min-heap (Queue)

import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueCode
{
    static void queueCode(Queue<Integer> pq)
    {
        pq.add(3);
        System.out.println(pq);
        pq.add(1);
        System.out.println(pq);
        pq.add(4);
        System.out.println(pq);
        pq.add(5);
        System.out.println(pq);
        pq.add(2);
        System.out.println(pq);

        System.out.println(pq.size());

        System.out.println(pq.remove());
        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);

        System.out.println(pq.peek());
        System.out.println(pq.element());

        if(pq.contains(4))
            System.out.println("Contains 4!");

        pq.clear();
        if(pq.isEmpty())
            System.out.println("Empty priority queue/min-heap: " + pq);
    }

    public static void main(String[] args)
    {
        System.out.println("PriorityQueue/Min-heap (Queue)...\n");

        Queue<Integer> pq = new PriorityQueue<>();
        queueCode(pq);
    }
}