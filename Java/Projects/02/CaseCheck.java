import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an input to verify : " );
        char ch = input.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("It is lowercase");
        } else if (ch <= 'Z' && ch >= 'A') {
            System.out.println("It is upper case");

        } else {
            System.out.println("It is not an alphabet");
        }
        input.close();
    }

}
