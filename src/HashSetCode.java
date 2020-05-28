// HashSet (Set)

import java.util.Set;
import java.util.HashSet;

public class HashSetCode
{
    static void hashSetCode(Set<Integer> s)
    {
        for(int i = 0; i < 5; i++)
            s.add(i + 1);

        System.out.println(s);
        System.out.println(s.size());

        s.add(3);
        System.out.println(s);

        s.add(6);
        System.out.println(s);

        if(s.contains(4))
            System.out.println("Contains 4!");

        s.remove(2);
        System.out.println(s);

        s.clear();
        if(s.isEmpty())
            System.out.println("Empty hashset: " + s);
    }

    public static void main(String[] args)
    {
        System.out.println("HashSet (Set)...\n");

        Set<Integer> s = new HashSet<>();
        hashSetCode(s);
    }
}