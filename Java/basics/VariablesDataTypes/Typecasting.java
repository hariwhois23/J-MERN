import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Float num = input.nextFloat();
        System.out.println(num);

        // typecasting a double into integer
        int num1 = (int) (1231243124124.12123123123);
        System.out.println(num1);
        long num2 = (int) (124124111111123L);

    }

}
