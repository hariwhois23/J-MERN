import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 5, 1, 5, 2, 3 };
        Insertion(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void Insertion(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

}
