public class CountDigits {
    public static void main(String[] args) {

        int num = 6;
        System.out.println(Digits(num));

    }

    static int Digits(int num) {
        int count = 0;
        while (num > 0) {
            count += 1;
            num = num >> 1;
        }
        return count;
    }

}
