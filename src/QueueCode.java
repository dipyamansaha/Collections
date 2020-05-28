// Queue (LinkedList)

import java.util.Queue;
import java.util.LinkedList;

public class QueueCode
{
    static void queueCode(Queue<Integer> q)
    {
        for(int i = 0; i < 5; i++)
            q.add(i + 1);

        System.out.println(q);
        System.out.println(q.size());

        System.out.println(q.remove());
        System.out.println(q);

        System.out.println(q.poll());
        System.out.println(q);

        System.out.println(q.peek());
        System.out.println(q.element());

        if(q.contains(4))
            System.out.println("Contains 4!");

        q.clear();
        if(q.isEmpty())
            System.out.println("Empty queue: " + q);
    }

    public static void main(String[] args)
    {
        System.out.println("Queue (LinkedList)...\n");

        Queue<Integer> q = new LinkedList<>();
        queueCode(q);
    }
}