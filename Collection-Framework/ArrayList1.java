import java.util.*;
public class ArrayList1 
{
    public static void main(String args[])
    {
        // Declaration of Arraylist
        ArrayList<Integer> arr=new ArrayList<>();
        // insert at end
        arr.add(1);
        arr.add(3);
        arr.add(2);
        //! insert at give index
        arr.add(0,5);
        //! removing the element at given index
        arr.remove(1);
        for(int val:arr)
        {
            System.out.println(val);
        }

        System.out.println(arr.isEmpty());
        System.out.println(arr.size());
        // printing
        System.out.println(arr);
        // using itertors
        //Get the Iterator for the ArrayList
        Iterator<Integer> iterator = arr.iterator();

        // Iterate over the elements using the Iterator
        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.println(element);
        }

        // reverse order
        // Get the ListIterator for the ArrayList
        ListIterator<Integer> it = arr.listIterator(arr.size());

        // Iterate over the elements in reverse direction
        while (it.hasPrevious()) {
            int element = it.previous();
            System.out.println(element);
        }
        arr.clear();
        System.out.println(arr);
    }
}
