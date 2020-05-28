// SortedSet (TreeSet)

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetCode
{
    static void sortedSetCode(SortedSet<Integer> ss)
    {
        ss.add(3);
        System.out.println(ss);
        ss.add(1);
        System.out.println(ss);
        ss.add(4);
        System.out.println(ss);
        ss.add(5);
        System.out.println(ss);
        ss.add(2);
        System.out.println(ss);

        System.out.println(ss.size());
        System.out.println(ss.first());
        System.out.println(ss.last());

        System.out.println(ss.headSet(4));
        System.out.println(ss.subSet(2, 5));
        System.out.println(ss.tailSet(3));

        if(ss.contains(4))
            System.out.println("Contains 4!");

        ss.remove(3);
        System.out.println(ss);

        ss.clear();
        if(ss.isEmpty())
            System.out.println("Empty sorted set: " + ss);
    }

    public static void main(String[] args)
    {
        System.out.println("SortedSet (TreeSet)...\n");

        SortedSet<Integer> ss = new TreeSet<>();
        sortedSetCode(ss);
    }
}