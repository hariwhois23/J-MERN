
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 7, 2, 1, 0 };
        Selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void Selection(int[] arr) {
        int i, j, temp;
        int n = arr.length;
        for (i = 0; i < n - 1; i++) {
            int min = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
    }

}
