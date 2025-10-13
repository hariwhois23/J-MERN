import java.util.ArrayList;

public class subsequences {
    public static void main(String[] args) {

        int[] arr = { 3, 1, 2 };
        int index = 0;
        ArrayList<Integer> current = new ArrayList<Integer>(); // creatig new object

        subsequence(arr, index, current);

    }

    static void subsequence(int[] arr, int index, ArrayList<Integer> current) {
        if (arr.length == index) {
            System.out.println(current);
            return;
        }
        // include current element
        current.add(arr[index]);
        subsequence(arr, index + 1, current);
        // exclude current element
        current.remove(current.size() - 1);
        subsequence(arr, index + 1, current);

    }

}
