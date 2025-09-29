public class FindNthMagicNumber {
    public static void main(String[] args) {
        int num = 6;
        System.out.println(magicNumber(num));

    }

    static int magicNumber(int n) {
        int ans = 0;
        int pow = 1;
        while (n > 0) {
            pow = pow * 5;
            if ((n & 1) == 1) {
                ans = ans + pow;
            }
            n >>= 1;
        }

        return ans;

    }

}
