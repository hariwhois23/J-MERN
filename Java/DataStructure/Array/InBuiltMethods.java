import java.util.Arrays;
import java.util.Collections;

public class InBuiltMethods {
    public static void main(String[] args) {
        Integer[] nos = { 91, 12, 3, 123, 1, 23, 1234, 5, 6, 7, 684 };
        Arrays.sort(nos); // This method sorts the array
        System.out.println(Arrays.toString(nos)); // returns the type int into string

        Arrays.sort(nos, Collections.reverseOrder()); //returns in the reverse order
        System.out.println(Arrays.toString(nos));

    }
}
