import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] reversed = reverseBrute(arr);

        for (int num : reversed) {
            System.out.print(num + " ");
        }

        int[] arr1 = { 5, 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(rev(arr1)));
    }

    static int[] reverseBrute(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = arr[n - i - 1]; // copy from the end
        }
        return res;
    }
    // two pointer style

    static int[] rev(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return arr;
    }
}