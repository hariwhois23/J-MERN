public class sumofnumber {
    public static void main(String[] args) {

        int num = 3;
        System.out.println(sum(num));

        sum2(3, 0);

    }

    static int ans = 0;

    static int sum(int num) {
        if (num <= 1) {
            return 1;
        }
        ans = num + sum(num - 1);
        return ans;
    }
    // way 2

    static void sum2(int num, int sum) {
        if (num < 1) {
            System.out.println(sum);
            return;
        }
        sum2(num - 1, sum + num);

    }
}
