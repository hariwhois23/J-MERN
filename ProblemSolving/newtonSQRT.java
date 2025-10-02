
public class newtonSQRT {
    public static void main(String[] args) {
        double num = 3;
        System.out.println(sqrt(num));

    }

    static double sqrt(double num) {
        double x = num;
        double root;
        while (true) {
            root = 0.5 * (x + (num / x));

            if (Math.abs(root - x) < 0.2) {
                break;
            }
            x = root; // to reiterate
        }
        return root;
    }
}
