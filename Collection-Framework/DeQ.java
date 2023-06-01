import java.util.*;


public class DeQ 
{
    public static void main(String args[])
    {
        Deque<Integer>de=new LinkedList<Integer>();
        de.addFirst(1);
        de.addLast(2);
        de.addFirst(100);
        de.addFirst(100);
        de.addFirst(0);
        de.removeFirst();
        int first= de.peekFirst();
        int last=de.peekLast();
        System.out.println(last+" "+first);
        System.out.println(de);
    }
}
