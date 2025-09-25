public class recursion01 {
    public static void main(String[] args) {
        numbers(1);

    }

    static void numbers(int n) {
        if (n == 7) {
            System.out.println(7);
            return;
        }
        System.out.println(n);
        numbers(n + 1);

    }

}
