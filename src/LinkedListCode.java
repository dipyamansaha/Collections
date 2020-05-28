// LinkedList (List)

import java.util.List;
import java.util.LinkedList;

public class LinkedListCode
{
    static void linkedListCode(List<Integer> ll)
    {
        for(int i = 0; i < 5; i++)
            ll.add(i + 1);

        System.out.println(ll);
        System.out.println(ll.size());
        System.out.println(ll.get(2));

        ll.add(2, 9);
        System.out.println(ll);
        System.out.println(ll.size());

        System.out.println(ll.remove(1));
        System.out.println(ll);

        System.out.println(ll.indexOf(4));

        if(ll.contains(3))
            System.out.println("Contains 3!");

        ll.clear();
        if(ll.isEmpty())
            System.out.println("Empty linked list: " + ll);
    }

    public static void main(String[] args)
    {
        System.out.println("LinkedList (List)...\n");

        List<Integer> ll = new LinkedList<>();
        linkedListCode(ll);
    }
}