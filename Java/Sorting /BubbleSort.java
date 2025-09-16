import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 2, 6, 1, 3, 12221, 2, 2, 13, 12, 3, 123 };
        BubleSort(arr); // since the return type is void
        System.out.println(Arrays.toString(arr));

    }

    static void BubleSort(int[] arr) {

        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            boolean swap = false;
            for (int j = 0; j < i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
 
    }
}
