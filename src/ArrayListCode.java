// ArrayList (List)

import java.util.List;
import java.util.ArrayList;

public class ArrayListCode
{
    static void arrayListCode(List<Integer> al)
    {
        for(int i = 0; i < 5; i++)
            al.add(i + 1);

        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.get(2));

        al.add(2, 9);
        System.out.println(al);
        System.out.println(al.size());

        System.out.println(al.remove(1));
        System.out.println(al);

        System.out.println(al.indexOf(4));

        if(al.contains(3))
            System.out.println("Contains 3!");

        al.clear();
        if(al.isEmpty())
            System.out.println("Empty array: " + al);
    }

    public static void main(String[] args)
    {
        System.out.println("ArrayList (List)...\n");

        List<Integer> al = new ArrayList<>();
        arrayListCode(al);
    }
}