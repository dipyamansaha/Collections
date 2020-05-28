// LinkedHashMap (HashMap)

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.SortedMap;

public class LinkedHashMapCode
{
    static void linkedHashMapCode(HashMap<Integer, Character> lhm)
    {
        lhm.put(3, 'A');
        System.out.println(lhm);
        lhm.put(1, 'B');
        System.out.println(lhm);
        lhm.put(4, 'C');
        System.out.println(lhm);
        lhm.put(5, 'D');
        System.out.println(lhm);
        lhm.put(2, 'E');
        System.out.println(lhm);

        System.out.println(lhm.size());

        LinkedHashMap<Integer, Character> lhmClone = (LinkedHashMap<Integer, Character>)lhm.clone();
        System.out.println("Clone: " + lhmClone);

        System.out.println(lhm.get(5));

        if(lhm.containsKey(3))
            System.out.println("Contains the key 3!");
        if(lhm.containsValue('B'))
            System.out.println("Contains the value B!");

        System.out.println(lhm.put(6, 'F'));
        System.out.println(lhm.put(4, 'G'));
        System.out.println(lhm.put(7, 'A'));
        System.out.println(lhm);

        System.out.println(lhm.entrySet());
        System.out.println(lhm.keySet());
        System.out.println(lhm.values());

        lhm.replace(5, 'H');
        System.out.println(lhm);

        if(lhm.replace(5, 'H', 'I'))
            System.out.println("Value 'H' replaced with 'I' for key 5!");

        System.out.println(lhm);

        for(Integer key: lhm.keySet())
            System.out.println(key + ": " + lhm.get(key));

        lhm.remove(2);
        System.out.println(lhm);

        if(lhm.remove(3, 'C'))
            System.out.println("3 removed!");

        System.out.println(lhm);

        lhm.clear();
        if(lhm.isEmpty())
            System.out.println("Empty linked hashmap: " + lhm);
    }

    public static void main(String[] args)
    {
        System.out.println("LinkedHashMap (HashMap)...\n");

        HashMap<Integer, Character> lhm = new LinkedHashMap<>();
        linkedHashMapCode(lhm);
    }
}