public class palindrome {
    public static void main(String[] args) {
        int num1 = 12345;
        System.out.println(palindrome(num1));

        int num2 = 5445;
        System.out.println(palindrome(num2));

    }

    static String palindrome(int num) {
        int rev = 0;
        int original = num;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            rev = (10 * rev) + rem;
        }

        if (original == rev) {
            return "Number is a Palindrome";
        } else {
            return "Not a Palindrome";
        }
    }
}
