

public class StringOperators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b"); // ab since its string not a character
        System.out.println('a' + 3); // 97 + 3 -> 100
        System.out.println((char) ('a' + 3)); // ASCII 100 -> d

        // Important
        System.out.println("a" + 1); // Output -> a1
        // the int here will be automatically converted to Integer class which has a
        // default
        // .toString() method attached to it
        // Which makes it "a" + "1" -> "a1"

    }

}
