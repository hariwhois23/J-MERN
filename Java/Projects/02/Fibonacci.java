import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range you want : ");
        int n = input.nextInt();
        // logic part

        int FirstNum = 0;
        int SecNum = 1;
        int Nextnum = 0;
        int count = 2;
        for (int i = 1; i <= n; i++) {

            Nextnum = FirstNum + SecNum;
            FirstNum = SecNum;
            SecNum = Nextnum;
            count++;
            if (count == n) {
                System.out.println(Nextnum);
            }
        }

        input.close();
    }
}
