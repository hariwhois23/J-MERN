import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 1, 3 };
        int high = arr.length - 1;
        mergesort(arr, 0, high);
        System.out.println(Arrays.toString(arr));

    }

    static void mergesort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergesort(arr, low, mid);
            mergesort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    static void merge(int[] arr, int low, int mid, int high) {
        int start = low; 
        ArrayList<Integer> temp = new ArrayList<>();
        int right = mid + 1;

        //Merging two sorted arrays before no one is exhausted
        while ((low <= mid) && (right <= high)) {

            if (arr[low] <= arr[right]) {
                temp.add(arr[low]);
                low++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        //If right is exhausted
        while (low <= mid) {
            temp.add(arr[low]);
            low++;
        }
        //If left is exhausted  
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        
        for (int i = 0; i < temp.size(); i++) {
            arr[start + i] = temp.get(i);
        }
    }

}
