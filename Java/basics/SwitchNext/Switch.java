import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // General switch statement
        System.out.print("Enter the name of the fruit: ");
        String fruit = input.next();

        switch (fruit) {
            case "mango":
                System.out.println("King of fruits");
                break;
            case "apple":
                System.out.println("Scares doctor");
                break;

            default:
                System.out.println("Some shitty fruit");
                break;
        }
    }
}
