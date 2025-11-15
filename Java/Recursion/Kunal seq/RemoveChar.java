
public class RemoveChar {
    public static void main(String[] args) {

        String name = "hpppppparpppppppppipppp";
        StringBuilder temp = new StringBuilder();
        System.out.println(extract(name, 'p', 0, temp));

    }

    static StringBuilder extract(String str, char target, int index, StringBuilder temp) {

        int n = str.length();
        if (index == n) {
            return temp;
        }
        if (str.charAt(index) != target) {
            temp.append(str.charAt(index));
        }

        return extract(str, target, index += 1, temp);

    }

}