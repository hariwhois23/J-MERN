import java.util.Scanner;

public class OrderdLinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = { 12, 24, 121, 231, 245 };
        int target = input.nextInt();
        int index = OrderdLinear(arr, target);
        System.out.println("The target element is found in the index: " + index);

    }

    static int OrderdLinear(int[] arr, int target) {
        int length = arr.length - 1;
        for (int i = 0; i <= length; i++) {
            if (arr[i] == target) {
                return i;
            }
            if (arr[i] > target) {
                return -1;

            }
        }
        return -1;

    }
}
