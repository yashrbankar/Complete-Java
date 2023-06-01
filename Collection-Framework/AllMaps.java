import java.util.*;

public class AllMaps 
{
    public static void main(String Args[])
    {
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(1, 100);
        mp.put(2,99);
        mp.put(3,90);
        mp.put(4,92);

        
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // mp[1]
        System.out.println(mp.get(1));


        System.out.println(mp.remove(3,90));
        System.out.println(mp);

        System.out.println(mp.containsKey(4));
        mp.remove(4); 
        System.out.println(mp.containsKey(4));

        System.out.println(mp.containsValue(100));
        System.out.println(mp);

        System.out.println();
        System.out.println();
        System.out.println();

        // ! Tree map for sorted order ;
        TreeMap<Integer,Integer> tmp=new TreeMap<>();

        tmp.put(3, 2);
        tmp.put(4, 2);
        tmp.put(5, 2);
        tmp.put(1, 2);
        tmp.put(2, 2);

        for(Map.Entry<Integer,Integer> val:tmp.entrySet())
        {
            System.out.println(val.getKey()+" "+val.getValue());
        }
    }
}
