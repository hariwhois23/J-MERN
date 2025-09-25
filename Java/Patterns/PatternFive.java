public class PatternFive {
    public static void main(String[] args) {
        int n = 5;
        pattern(5);

    }

    static void pattern(int n) {
        for (int i = 1; i <= (2 * n) - 1; i++) {
            if (i > n) {
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print("* ");
                }

            } else {
                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }
}