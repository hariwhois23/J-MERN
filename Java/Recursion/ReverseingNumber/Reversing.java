public class Reversing {
    public static void main(String[] args) {
        int number = 12456;
        System.out.println(rev(number));

        System.out.println(palindrome(number)); // returns false since its not a palindrome

        System.out.println(palindrome(121)); // returns true since its a palindrome
    }

    static int rev(int num) {
        if (num < 10) {
            return num;
        }
        int rem = num % 10;
        int digits = (int) (Math.log10(num) + 1);

        return rem * (int) Math.pow(10, digits - 1) + rev(num / 10);
    }

    static boolean palindrome(int num) {
        return num == rev(num);
    }
}