// Stack

import java.util.Stack;

public class StackCode
{
    static void stackCode(Stack<Integer> s)
    {
        for(int i = 0; i < 5; i++)
            s.push(i + 1);

        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.elementAt(3));

        Stack<Integer> sClone = (Stack<Integer>)s.clone();
        System.out.println("Clone: " + sClone);

        System.out.println(s.pop());
        System.out.println(s);

        System.out.println(s.peek());

        System.out.println(s.search(3));

        if(s.contains(2))
            System.out.println("Contains 2!");

        s.clear();
        if(s.empty())
            System.out.println("Empty stack: " + s);
    }

    public static void main(String[] args)
    {
        System.out.println("Stack...\n");

        Stack<Integer> s = new Stack<>();
        stackCode(s);
    }
}