import java.util.Scanner;

public class inputTwoD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] arr = new int[3][2];
        System.out.println(arr.length); //shows only the length of the row


        //Inputing the multi dimension 2D array
        for (int row = 0; row < 3; row++) {
            for (int col = 0 ; col < 2 ; col++ ){
                arr[row][col] = input.nextInt();
            }
            

        }

        //Outputting the 2D array
        for (int row = 0; row < 3; row++) {
            for (int col = 0 ; col < 2 ; col++ ){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();

        }

    }
}
