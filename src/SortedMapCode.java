// SortedMap (TreeMap)

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapCode
{
    static void sortedMapCode(SortedMap<Integer, Character> sm)
    {
        sm.put(3, 'A');
        System.out.println(sm);
        sm.put(1, 'B');
        System.out.println(sm);
        sm.put(4, 'C');
        System.out.println(sm);
        sm.put(5, 'D');
        System.out.println(sm);
        sm.put(2, 'E');
        System.out.println(sm);

        System.out.println(sm.get(3));
        System.out.println(sm.firstKey());
        System.out.println(sm.lastKey());

        System.out.println(sm.headMap(4));
        System.out.println(sm.subMap(2, 5));
        System.out.println(sm.tailMap(3));

        System.out.println(sm.size());

        System.out.println(sm.entrySet());
        System.out.println(sm.keySet());
        System.out.println(sm.values());

        System.out.println(sm.put(6, 'F'));
        System.out.println(sm.put(4, 'G'));
        System.out.println(sm.put(7, 'A'));
        System.out.println(sm);

        sm.replace(1, 'H');
        System.out.println(sm);

        if(sm.replace(5, 'E', 'I'))
            System.out.println("Value 'E' replaced with 'I' for key 5!");

        System.out.println(sm);

        for(Integer key: sm.keySet())
            System.out.println(key + ": " + sm.get(key));

        if(sm.containsKey(4))
            System.out.println("Contains key 4!");

        if(sm.containsValue('B'))
            System.out.println("Contains value B!");

        sm.remove(3);
        System.out.println(sm);

        if(sm.remove(2, 'B'))
            System.out.println("2 removed!");

        System.out.println(sm);

        sm.clear();
        if(sm.isEmpty())
            System.out.println("Empty sorted map: " + sm);
    }

    public static void main(String[] args)
    {
        System.out.println("SortedMap (TreeMap)...\n");

        SortedMap<Integer, Character> sm = new TreeMap<>();
        sortedMapCode(sm);
    }
}