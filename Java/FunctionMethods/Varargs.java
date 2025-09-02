import java.lang.reflect.Array;

public class Varargs {
    public static void main(String[] args) {
        

    }

   static public void add(int... v) {

        System.out.println(Array.getInt(v, 0));

    }
}
