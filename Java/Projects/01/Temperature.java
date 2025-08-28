import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value in F or C : ");
        String unit = input.nextLine();
        System.out.println("Enter the value of the number: ");
        Float degree = input.nextFloat();

        if (unit == "F") {
            float value = (degree - 32) * (5f / 9f);
            System.out.println("The converted value from F to C is " + value);

        } else {
            float value = (degree * (9f / 5f)) + 32;
            System.out.println("The converted value from C to F is " + value);
        }

        input.close();
    }
}