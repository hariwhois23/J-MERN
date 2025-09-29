public class OddOrEve {
    public static void main(String[] args) {
        int n = 155;
        System.out.println(OddEve(n));

    }

    static String OddEve(int n) {
        if ((n & 1) == 0) {
            return "even";
        }
        return "odd";
    }

}
