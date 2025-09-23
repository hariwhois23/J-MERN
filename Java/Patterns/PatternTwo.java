
public class PatternTwo {
    public static void main(String[] args) {
        int a = 5;
        pattern(a);
        System.out.println();
        int b = 3;
        pattern(b);

    }

    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *

    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
