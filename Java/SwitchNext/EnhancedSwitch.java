import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a fruit name: ");
        String fruit = input.next();
        // Syntax for super switch

        switch (fruit) {
            case "mango" -> System.out.println("King of fruits");
            case "apple" -> System.out.println("Scares Doctor");
            default -> System.out.println("Enter proper fruit");

        }

    }
    
}
