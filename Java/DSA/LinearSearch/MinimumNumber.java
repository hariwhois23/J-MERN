
public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 234, 20, 21, 0, 33, 3171, 321 };
        int min = minnum(arr);
        System.out.println(min);

    }

    static int minnum(int[] arr) {
        int min = arr[0];
        int length = arr.length - 1;
        for (int i = 1; i <= length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}
