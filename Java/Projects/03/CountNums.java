
import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number ");
        int num = input.nextInt();

        System.out.println("Count the number ");
        int c = input.nextInt();
        int count = 0;

        while (num > 0) {
            int rem = num % 10;
            if (rem == c) {
                count++;
            }
            num = num / 10;
        }

        System.out.println(count);

        input.close();

    }

}
