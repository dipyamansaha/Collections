// LinkedHashSet (HashSet)

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetCode
{
    static void linkedHashSetCode(HashSet<Integer> lhs)
    {
        lhs.add(3);
        System.out.println(lhs);
        lhs.add(1);
        System.out.println(lhs);
        lhs.add(4);
        System.out.println(lhs);
        lhs.add(5);
        System.out.println(lhs);
        lhs.add(2);
        System.out.println(lhs);

        System.out.println(lhs.size());

        LinkedHashSet<Integer> lhsClone = (LinkedHashSet<Integer>)lhs.clone();
        System.out.println("Clone: " + lhsClone);

        lhs.add(3);
        System.out.println(lhs);

        lhs.add(6);
        System.out.println(lhs);

        if(lhs.contains(4))
            System.out.println("Contains 4!");

        lhs.remove(2);
        System.out.println(lhs);

        lhs.clear();
        if(lhs.isEmpty())
            System.out.println("Empty linked hashset: " + lhs);
    }

    public static void main(String[] args)
    {
        System.out.println("LinkedHashSet (HashSet)...\n");

        HashSet<Integer> lhs = new LinkedHashSet<>();
        linkedHashSetCode(lhs);
    }
}