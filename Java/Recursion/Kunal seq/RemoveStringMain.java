public class RemoveStringMain {
    public static void main(String[] args) {
        String name = "appleMKBHDappleapp";
        System.out.println(rmString(name, "apple"));

    }

    static String rmString(String word, String tgt) {
        if (word.isEmpty()) {
            return word;
        }

        int len = tgt.length();

        if (word.startsWith(tgt)) {
            return rmString(word.substring(len), tgt);
        }

        else {
            return word.charAt(0) + rmString(word.substring(1), tgt);
        }
    }

}
