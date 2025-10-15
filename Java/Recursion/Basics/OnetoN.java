public class OnetoN {
    public static void main(String[] args) {
        num(1, 6);

    }

    static void num(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        num(i + 1, n);

        ;
    }
}
