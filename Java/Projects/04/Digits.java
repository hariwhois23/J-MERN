public class Digits {
    public static void main(String[] args) {
        int num = 12;
        System.out.println(isArmstrong(num));
    }

    static boolean isArmstrong(int num) {
        int og = num;
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            sum = sum + (rem * rem * rem);
            num /= 10;
        }
        if (sum == og) {
            return true;
        } else {
            return false;
        }

    }

    static int digits(int num) {

        int count = 0;

        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

}
