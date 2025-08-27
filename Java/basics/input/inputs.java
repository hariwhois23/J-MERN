import java.util.Scanner;

public class inputs {

    public static void main(String args[]) {
        System.out.print("What is your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        
        System.out.println("Your name is " + name);

        scanner.close();

    }
}