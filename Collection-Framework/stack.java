import java.util.*;

public class stack 
{
    public static void main(String args[])
    {
        Stack<Integer> st = new Stack<>();

        // Pushing elements onto the stack
        System.out.println("element pushed:: "+st.push(10));
        st.push(20);
        st.push(30);

        // Checking if the stack is empty
        boolean isEmpty = st.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);

        // Getting the size of the stack
        int size = st.size();
        System.out.println("Size of stack: " + size);

        // Popping elements from the stack
        int element1 = st.pop();
        int element2 = st.pop();
        System.out.println("Popped elements: " + element1 + ", " + element2);

        // Getting the top element of the stack
        int topElement = st.peek();
        System.out.println("Top element of stack: " + topElement);
    }
}
