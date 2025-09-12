
import java.util.Arrays;

public class LeetCode34BF {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,8,8};
        int[] ans =FirstandLast(arr, 8);
        System.out.println(Arrays.toString(ans));

    }

    static int[] FirstandLast(int[] arr, int target){
        int left = BinarySearch(arr,target,true);
        int right = BinarySearch(arr, target, false);
        return new int[] {left,right};
        
    }

    static int BinarySearch(int[] nums, int target, boolean IsLeft) {
        int start = 0;
        int end = nums.length - 1;
        int i = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            }
            if (nums[mid] < target) {
                start = mid + 1;
            }
            if (nums[mid] == target) {
                i = mid;
                if (IsLeft == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return i;
    }

}
