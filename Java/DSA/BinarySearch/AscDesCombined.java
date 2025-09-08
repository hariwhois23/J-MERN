public class AscDesCombined {
    public static void main(String[] args) {
        int[] arr1 = { 90, 75, 18, 12, 6, 4, 3, 1 };
        int ans1 = BinarySearch(arr1, 75);
        System.out.println(ans1);

        int[] arr = { -19, -12, -9, 1, 7, 8, 12, 22 };
        int ans = BinarySearch(arr, 12);
        System.out.println(ans);

    }

    // binary search for both ASC and DSC sorted array
    static int BinarySearch(int[] arr, int target) {

        int start, end;
        start = 0;
        end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                }
                if (arr[mid] > target) {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;

                }
                if (arr[mid] < target) {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }

}
