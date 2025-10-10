public class PalindromeString {
    public static void main(String[] args) {
        String word = "madam";
        System.out.println(palindrome(word, 0, word.length()));

    }

    static boolean palindrome(String word, int start, int end) {

        if (start >= end) {
            return true;
        }
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }

        return palindrome(word, start + 1, end - 1);

    }

}
