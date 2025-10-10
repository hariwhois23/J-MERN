public class NtoOne {
    public static void main(String[] args) {
        num(1, 5);

    }

    static void num(int i, int n) {
        if (i > n) {
            return;
        }
        num(i + 1, n);
        System.out.println(i);
    }

}
