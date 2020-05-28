// Deque (LinkedList)

import java.util.Deque;
import java.util.LinkedList;

public class DequeCode
{
    static void dequeCode(Deque<Integer> d)
    {
        for(int i = 0; i < 5; i++)
            d.add(i + 1);

        System.out.println(d);
        System.out.println(d.size());
        System.out.println(d.getFirst());
        System.out.println(d.getLast());

        d.addFirst(6);
        System.out.println(d);
        d.addLast(7);
        System.out.println(d);
        d.add(8);
        System.out.println(d);
        d.push(9);
        System.out.println(d);
        d.push(1);
        System.out.println(d);
        d.push(5);
        System.out.println(d);

        System.out.println(d.removeFirstOccurrence(1));
        System.out.println(d);
        System.out.println(d.removeLastOccurrence(5));
        System.out.println(d);
        System.out.println(d.removeFirst());
        System.out.println(d);
        System.out.println(d.removeLast());
        System.out.println(d);
        System.out.println(d.remove());
        System.out.println(d);
        System.out.println(d.pop());
        System.out.println(d);

        System.out.println(d.pollFirst());
        System.out.println(d);
        System.out.println(d.pollLast());
        System.out.println(d);
        System.out.println(d.poll());
        System.out.println(d);

        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
        System.out.println(d.peek());
        System.out.println(d.element());

        if(d.contains(4))
            System.out.println("Contains 4!");

        d.clear();
        if(d.isEmpty())
            System.out.println("Empty double-ended queue: " + d);
    }

    public static void main(String[] args)
    {
        System.out.println("Deque (LinkedList)...\n");

        Deque<Integer> d = new LinkedList<>();
        dequeCode(d);
    }
}
