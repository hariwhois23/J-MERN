public class PilotRecursion {
    public static void main(String[] args) {

        num2(1);

    }

    static void num2(int n) {
        System.out.println(n);
        num3(2);
    }

    static void num3(int n) {
        System.out.println(n);
        num4(3);
    }

    static void num4(int n) {
        System.out.println(n);
    }
}