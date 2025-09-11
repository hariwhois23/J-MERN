public class CeilingFloor {
    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 5, 9, 14, 16, 18 };
        int ans1 = CeilUsingBinarySearch(arr1, 15);
        System.out.println("Ceiling to target is " + ans1);

        int ans2 = FloorUsingBinarySearch(arr1, 15);
        System.out.println("Floor to target is " + ans2);

    }

    static int CeilUsingBinarySearch(int[] arr, int target) {

        // target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        int s, e;
        s = 0;
        e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else if (arr[mid] > target) {
                e = mid - 1;
            }

        }
        // when the loop breaks
        return s; // returns the Ceiling value of the number
    }

    static int FloorUsingBinarySearch(int[] arr, int target) {
        // if (target < arr[0]){
        // return -1;
        // }
        int s, e;
        s = 0;
        e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else if (arr[mid] < target) {
                s = mid + 1;
            }
        }
        // when the loop breaks
        return e; // returns the floor value of the number
    }

}
