
import java.util.Arrays;

public class LargestElementArray {
    public static void main(String[] args) {
        int[] list = { 12, 5, 9, 57, 3, 0, 99, 9 };
        System.out.println(LargestElementBruteForce(list));
        int[] list2 = { 12, 11, 1001, 12, 5, 9, 57, 3, 0, 99, 9 };
        System.out.println(LargestElementEfficient(list2));
    }

    static int LargestElementBruteForce(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        return arr[n - 1];
    }

    static int LargestElementEfficient(int[] arr) {
        int n = arr.length;
        int max = 0;
        for (int i = 1; i < n; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return arr[max];
    }
}