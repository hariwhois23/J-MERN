public class Palindrome {
    public static void main(String[] args) {
        String name = "madam";
        System.out.println(palindrome(name));

        String check = "ababbab";
        System.out.println(palindrome(check));

    }

    static boolean palindrome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i <= str.length() / 2; i++) { // until middle ma(d)am
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i); // -1-0= last element -1-1 =-2.....
            if (start != end) {
                return false;
            }

        }
        return true;
    }

}
