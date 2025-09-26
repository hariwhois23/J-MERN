import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, 2, 4 };
        CycleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void CycleSort(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int crt = arr[i] - 1; // main logic
            if (arr[crt] != arr[i]) {
                swap(arr, i, crt);
            } else {
                i++;
            }
        }

    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
