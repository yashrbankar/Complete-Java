import java.util.*;

public class AllSet 
{
    public static void main(String args[])
    {
        //! random order order
        HashSet<Integer> hs=new HashSet<Integer>();
        //! same order of insertion
        LinkedHashSet<Integer>ls=new LinkedHashSet<>();
        //! sorted order of insertion
        TreeSet<Integer>ts=new TreeSet<>();

        hs.add(1);
        hs.add(12);
        hs.add(12);
        hs.add(2);
        hs.add(2);
        hs.add(5);
        hs.add(1);
        hs.add(100);
        hs.remove(1);

        System.out.println("check present :"+hs.contains(1));
        
        
        
        System.out.println("order is not fixed :"+hs);

        ls.add(1);
        ls.add(1);
        ls.add(12);
        ls.add(12);
        ls.add(2);
        ls.add(2);
        ls.add(5);
        ls.add(5);
        System.out.println("same order of insertion:"+ls);

        ts.add(1);
        ts.add(1);
        ts.add(12);
        ts.add(12);
        ts.add(2);
        ts.add(5);
        System.out.println("sorted order"+ts);
    }
}
