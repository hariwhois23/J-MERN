package ProblemSolving.Arrays;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {

    }

    // brute force
    static int bruteforce(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int largest = arr[n - 1];
        for (int i = n - 2; i >= 0; i++) {
            if (arr[i] != largest) {
                int second = arr[i];
                break;
            }
        }
        return second;
    }

}
