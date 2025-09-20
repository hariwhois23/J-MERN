
import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 5, 5, 5, 5 };
        System.out.println(optimal(arr));

    }

    // brute force //Time complexity Sorting - O(nlogn); For loop - O(n)
    static int bruteforce(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int largest = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                return arr[i];
            }
        }
        return -1;
    }

    // Better than the BruteForce approach
    // Time complexity For loop - O(n) For | loop O(n) overall O(n) + O(n) = O(2n)
    static int Efficient(int[] arr) {
        int n = arr.length;
        // finding the largest
        int largest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        int seclargest = -1;
        for (int j = 0; j < n; j++) {
            if (arr[j] > seclargest && arr[j] != largest) {
                seclargest = arr[j];
            }
        }
        return seclargest;

    }

    // The best solution | Time complexity O(n)
    static int optimal(int[] arr) {
        int n = arr.length;
        // If the array consists negative number use the Integer.MIN_VALUE instead of -1
        int largest = -1;
        int secondLargest = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }

        }
        return secondLargest;
    }

}
