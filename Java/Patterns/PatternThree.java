public class PatternThree {
    public static void main(String[] args) {
        int a = 5;
        pattern(a);

    }

    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}
