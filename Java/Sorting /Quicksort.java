import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {

        int[] arr = { 4, 6, 2, 5, 7, 9 };
        int high = arr.length - 1;
        quicksort(arr, 0, high);
        System.out.println(Arrays.toString(arr));

    }

    static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = pivot(arr, low, high);
            quicksort(arr, low, partition - 1);
            quicksort(arr, partition + 1, high);
        }
    }

    static int pivot(int[] arr, int low, int high) {
        int left, right, pivot_item;
        left = low;
        right = high;
        pivot_item = arr[low];

        while (left < right) {
            while (arr[left] <= pivot_item) {
                left++;
            }
            while (arr[right] > pivot_item) {
                right--;
            }
            if (left < right) {
                swap(arr, left, right);
            }
        }
        arr[low] = arr[right];
        arr[right] = pivot_item; 

        return right;
    }

    static int swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

        return temp;
    }

}
