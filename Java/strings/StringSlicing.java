public class StringSlicing {
    public static void main(String[] args) {
        // You cannot get the char of strings like this
        // string name = "hari"; name[0] -> Error
        // Use the method .charAt(index)
        String name = "hari";
        System.out.println(name.charAt(0)); // -> gives h
        int n = name.length();

        // This is how you index the String
        for (int i = 0; i < n; i++) {
            System.out.println(name.charAt(i));
        }
    }

}
