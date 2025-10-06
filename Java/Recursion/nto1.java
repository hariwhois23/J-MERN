public class nto1 {
    public static void main(String[] args) {
        int num = 5;
        funBoth(num);

    }

    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(n - 1);

    }

    static void funRev(int num) {

        if (num == 0) {
            return;
        }
        funRev(num - 1);
        System.out.println(num);

    }

    static void funBoth(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n); // descending
        funBoth(n - 1);
        System.out.println(n); // ascending

    }

}
