import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        Integer[] arr = {5, 3, 8, 2, 1, 9, 4, 7, 6};

        Arrays.sort(arr, Collections.reverseOrder());
        for (int number : arr) {
            System.out.print(number + " ");
        }
    }
}
