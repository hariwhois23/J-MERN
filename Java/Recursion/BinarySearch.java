public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 8 };
        int start = 0;
        int end = arr.length - 1;
        int target = 8;

        System.out.println(BS(arr, target, start, end));
    }

    static int BS(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                return BS(arr, target, start, mid - 1);
            }
            return BS(arr, target, mid + 1, end);
        }

        return -1;
    }

}
