public class RemoveSpecialChr {
    public static void main(String[] args) {
        String name = "h!@!@!@a)(&)&*()r(*)&i}{}{}@|{{|}|}";
        removeSpCh(name);

    }

    static void removeSpCh(String word) {
        String cleaned = word.replaceAll("[^a-zA-Z0-9]", ""); // regular expression says anything except those would be
                                                              // replaced with none (not space)
        System.out.println(cleaned);
    }

}
