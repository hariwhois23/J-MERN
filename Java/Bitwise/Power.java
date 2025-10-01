public class Power {
    public static void main(String[] args) {
        System.out.println(power(5, 5));

    }

    static int power(int base, int exp) {
        int ans = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                ans = ans * base;
            }
            base *= base;

            exp >>= 1;
        }

        return ans;
    }

}
