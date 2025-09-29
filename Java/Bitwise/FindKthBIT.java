public class FindKthBIT {
    public static void main(String[] args) {
        int num = 170;
        System.out.println(KthBIT(num, 5));

    }

    static int KthBIT(int num, int bit) {

        return num & (1 << bit);
    }

}
