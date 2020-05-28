// HashMap (Map)

import java.util.Map;
import java.util.HashMap;

public class HashMapCode
{
    static void hashMapCode(Map<Integer, Character> hm)
    {
        char ch = 'A';
        for(int i = 0; i < 5; i++)
        {
            hm.put((i + 1), ch);
            ch++;
        }

        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.get(5));

        if(hm.containsKey(3))
            System.out.println("Contains the key 3!");
        if(hm.containsValue('B'))
            System.out.println("Contains the value B!");

        System.out.println(hm.put(6, 'F'));
        System.out.println(hm.put(4, 'G'));
        System.out.println(hm.put(7, 'A'));
        System.out.println(hm);

        System.out.println(hm.entrySet());
        System.out.println(hm.keySet());
        System.out.println(hm.values());

        hm.replace(5, 'H');
        System.out.println(hm);

        if(hm.replace(5, 'H', 'I'))
            System.out.println("Value 'H' replaced with 'I' for key 5!");

        System.out.println(hm);

        for(Integer key: hm.keySet())
            System.out.println(key + ": " + hm.get(key));

        hm.remove(2);
        System.out.println(hm);

        if(hm.remove(3, 'C'))
            System.out.println("3 removed!");

        System.out.println(hm);

        hm.clear();
        if(hm.isEmpty())
            System.out.println("Empty hashmap: " + hm);
    }

    public static void main(String[] args)
    {
        System.out.println("HashMap (Map)...\n");

        Map<Integer, Character> hm = new HashMap<>();
        hashMapCode(hm);
    }
}