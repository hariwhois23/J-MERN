import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        sum();
        int ans = sum2();
        System.out.println(ans);

    }

    // Normal function
    static void sum() {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("The sum is : " + sum);

    }

    // Function with return statement
    static int sum2() {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a + b;
        return sum;

    }

}
