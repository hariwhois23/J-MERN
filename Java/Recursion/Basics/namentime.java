public class namentime {
    public static void main(String[] args) {
        name(1, 5);

    }

    static void name(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("name");

        name(i + 1, n);

    }
}