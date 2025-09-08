public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = { 90, 75, 18, 12, 6, 4, 3, 1 };
        int ans = BinarySearch(arr, 75);
        System.out.println(ans);

    }

    static int BinarySearch(int[] arr, int target) {
        int start, end;
        start = 0;
        end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                start = mid + 1;
            } else if (arr[mid] < target) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
