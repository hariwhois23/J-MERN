public class ExponentsNaive {
    public static void main(String[] args) {
        int sol = power(2, 3);
        System.out.println(sol);

    }

    static int power(int num, int exp) {
        int ans = 1;
        for (int i = 1; i <= exp; i++) {
            ans = num * ans;
        }
        return ans;
    }

}
