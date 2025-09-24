public class ReversingString {
    public static void main(String[] args) {
        String name = "hello";
        method2(name);

        System.out.println();

        //Using the StringBuffer
        String name1 = "madam111";
        StringBuffer word = new StringBuffer(name1);
        System.out.println(word.reverse());


    }

    static void Method1(String word) {
        int n = word.length();
        char[] arr = word.toCharArray(); // converts the string to an character array [o,l,l,e,h]
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }

    }

    static void method2(String word) {
        int n = word.length();
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(word.charAt(i)); // remember this method

        }
    }

}
