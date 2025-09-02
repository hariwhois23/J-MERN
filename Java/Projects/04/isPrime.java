import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check if its prime or not: ");
        int num = input.nextInt();
        System.out.println(isPrime(num));

    }

    static boolean isPrime(int n) {
        
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) { 
                return false;
            }
            c++;
        }
        return c * c > n;

    }

}
