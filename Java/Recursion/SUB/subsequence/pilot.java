import java.util.ArrayList;

public class pilot {
    public static void main(String[] args) {
        String word = "abc";
        ArrayList<String> sol = new ArrayList<>();
        subseq(word, "");

    }

    static void subseq(String up, String p) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(up.substring(1), ch + p);
        subseq(up.substring(1), p);

    }

}
