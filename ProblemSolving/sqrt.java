public class sqrt {
    public static void main(String[] args) {
        int num = 36;
        System.out.println(sqrt1(num));

    }

    static int sqrt1(int num) {
        int start = 0;
        int end = num;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((mid * mid) == num) {
                return mid;

            }
            if ((mid * mid) > num) {
                end = mid - 1;
            } else {
                ans = mid; // returns the nearby perfect square of the number

                start = mid + 1;
            }
        }
        return ans;
    }
}