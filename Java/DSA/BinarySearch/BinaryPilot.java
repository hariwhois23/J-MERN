public class BinaryPilot {
    public static void main(String[] args) {

        int[] arr = { -19, -12, -9, 1, 7, 8, 12, 22 };
        int ans = BinarySearch(arr, 12);
        System.out.println(ans);

    }

    static int BinarySearch(int[] arr, int target) {
        int s, e;
        s = 0;
        e = arr.length - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] < target) {
                s = mid + 1;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;
    }
}
