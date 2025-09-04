import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;

public class Reversingarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = { 12, 4, 19, 45, 12, 32 };

        int[] newarr = rev(array);
        System.out.println(Arrays.toString(newarr));

    }

    static int[] rev(int[] arr) {
        int p1 = 0;
        int p2 = arr.length - 1;
        while (p1 < p2) {
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
        return arr;
    }

}
