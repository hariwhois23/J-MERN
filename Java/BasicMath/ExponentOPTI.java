public class ExponentOPTI {
    public static void main(String[] args) {
        System.out.println(power(3, 9));

    }

    static int power(int num, int exp) {
        int ans = 1;
        int num_d = num; // duplicate to check whether its positive or negative
        while (exp > 0) {
            if (exp % 2 != 0) {
                exp = exp - 1;
                ans = ans * num;
            } else {
                exp = exp / 2;
                num = num * num;
            }

        }
        if (num_d < 0) {
            return 1 / ans;
        } else {
            return ans;
        }
    }

}
