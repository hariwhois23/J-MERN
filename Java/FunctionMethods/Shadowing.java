import java.util.Scanner;

public class Shadowing {
    static float pi = 3.143f; // this will be shadowed

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of the radius : ");
        float rad = input.nextFloat();
        float pi = 3.1f; // Declared new so the above one will be shadowed

        float area = pi * (rad * rad);
        System.out.println("The value of pi is : " + pi());
        System.out.println("The area of the circle is : " + area);

        input.close();
    }

    static public float pi() {
        return pi;
    }
}
