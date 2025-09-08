public class reversing {
    public static void main(String[] args) {
        int num = 123;
        int ans = reverse(num);
        System.out.println(ans);
    }

    static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num /= 10;
        }
        return rev;
    }
}
