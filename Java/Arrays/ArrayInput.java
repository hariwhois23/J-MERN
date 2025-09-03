
import java.util.*;

public class ArrayInput {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[6];

        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = input.nextInt();

        }
        // Using the for each loop printing the elements in the array
        for (int num : arr) {
            System.out.print(num + ", ");
        }

        System.out.println(" ");

        // Printing the array using the toString method
        int[] two = { 1, 2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(two));

    }

}
