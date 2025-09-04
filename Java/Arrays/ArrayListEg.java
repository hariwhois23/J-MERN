import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListEg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>(10);
        arr.add(21);
        arr.add(12);
        arr.add(50);

        System.out.println(arr);

    }

}
