public class sumRecursion {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(sum(num));

    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

}
