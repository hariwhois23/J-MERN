public class EucledianGCD {
    public static void main(String args[]) {
        System.out.println(Eucledian(40, 20));

    }

    static int Eucledian(int a, int b) {

        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        } else {
            return a;
        }

    }

}
