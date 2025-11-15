import java.util.ArrayList;
import java.util.Arrays;

public class inArrayList {
    public static void main(String[] args) {
        String word = "abc";
        System.out.println(subseq(word, ""));

    }

    static ArrayList<String> subseq(String up, String p) {
        if (up.isEmpty()) {
            ArrayList<String> sol = new ArrayList<>();
            sol.add(p);
            return sol;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseq(up.substring(1), p + ch);
        ArrayList<String> right = subseq(up.substring(1), p);

        left.addAll(right); //appends the right element to the left ArrayList<>()
        return left;

    }

}
