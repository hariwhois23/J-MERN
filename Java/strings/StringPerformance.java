public class StringPerformance {
    public static void main(String[] args) {
        // priting the char from a - z
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            System.out.printf("%d %c", i, ch);
        }

        String str = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i); // this consumes a lot of memory during the execution
            str = str + ch;
        }
        System.out.println(".  " + str);
    }

}
