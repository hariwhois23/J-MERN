import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What's your name: ");
        String name = input.nextLine();
        if (name.equalsIgnoreCase("HARI")) { // ignores the case sensitivity
            System.out.println("Welcome Mr.Prasath");
        } else {
            System.out.println("Weclcome " + name);
        }

        input.close();
    }
}