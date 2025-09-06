public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = { 12, 245, 2, 6, 7896 };
        int ans = findNumbers(nums);
        System.out.println(ans);

    }

    static int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            int digits = 0;
            while (number > 0) {
                number /= 10;
                digits++;
            }
            if (digits % 2 == 0) {
                count++;
            }

        }
        return count;
    }
}