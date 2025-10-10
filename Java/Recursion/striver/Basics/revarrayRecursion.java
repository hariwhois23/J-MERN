import java.util.Arrays;

public class revarrayRecursion {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        rev(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    static void rev(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        // sawp first and last
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        rev(arr, left++, right-1);

    }
}
