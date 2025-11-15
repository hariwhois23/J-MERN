public class RemoveString {
    public static void main(String[] args) {
        String name = "hpppppparpppppppppipppp";
        System.out.println(remove(name, 'p'));

        // skip("", name); // for the void type function

    }

    // Void type function
    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'p') {
            skip(p, up.substring(1));

            // (in the substring method) The string does not begin with the index 0
            // substring(1) removes the first character of the string
            

        } else {
            skip(p + ch, up.substring(1));
        }

    }


    // return type is of String
    
    static String remove(String word, char tgt) {
        if (word.isEmpty()) {
            return "";
        }
        char c = word.charAt(0);

        if (c == tgt) {
            return remove(word.substring(1), tgt);
        } else {
            return c + remove(word.substring(1), tgt);
        }
    }

}
