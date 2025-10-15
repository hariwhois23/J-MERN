
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 24, 12, 4, 231, 54, 346, 5 };
        int target = 5;
        System.out.println(linear(arr, 0, target));

    }

    static int linear(int[] arr, int i, int target) {
        if (i == arr.length) {
            return -1; // not found
        }
        if (arr[i] == target) {
            return i; // target found
        }

        return linear(arr, i + 1, target); // recursion function call
    }

}
