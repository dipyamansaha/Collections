// Hashtable

import java.util.Hashtable;

public class HashtableCode
{
    static void hashTableCode(Hashtable<Integer, Character> ht)
    {
        char ch = 'A';
        for(int i = 0; i < 5; i++)
        {
            ht.put((i + 1), ch);
            ch++;
        }

        System.out.println(ht);
        System.out.println(ht.size());

        Hashtable<Integer, Character> htClone = (Hashtable<Integer, Character>)ht.clone();
        System.out.println("Clone: " + htClone);

        System.out.println(ht.get(3));

        if(ht.containsKey(4))
            System.out.println("Contains the key 4!");
        if(ht.containsValue('D'))
            System.out.println("Contains the value D!");

        System.out.println(ht.put(6, 'F'));
        System.out.println(ht.put(2, 'G'));
        System.out.println(ht.put(7, 'B'));
        System.out.println(ht);

        System.out.println(ht.entrySet());
        System.out.println(ht.keySet());
        System.out.println(ht.values());

        ht.replace(5, 'H');
        System.out.println(ht);

        if(ht.replace(5, 'H', 'I'))
            System.out.println("Value 'H' replaced with 'I' for key 5!");

        System.out.println(ht);

        for(Integer key: ht.keySet())
            System.out.println(key + ": " + ht.get(key));

        ht.remove(3);
        System.out.println(ht);

        if(ht.remove(1, 'A'))
            System.out.println("1 removed!");

        System.out.println(ht);

        ht.clear();
        if(ht.isEmpty())
            System.out.println("Empty hashtable: " + ht);
    }

    public static void main(String[] args)
    {
        System.out.println("Hashtable...\n");

        Hashtable<Integer, Character> ht = new Hashtable<>();
        hashTableCode(ht);
    }
}
