package ReverseingNumber;
public class Reversing {
    public static void main(String[] args) {

        revInt(1234);

    }

    static void revInt(int num) {
        if (num < 10) {
            System.out.print(num);
            return;
        } else {
            System.out.print(num % 10);
            revInt(num / 10);
        }
    }

}
