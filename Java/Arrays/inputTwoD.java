import java.util.Scanner;

public class inputTwoD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] arr = new int[3][2];
        System.out.println(arr.length); //shows only the length of the row

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0 ; col < arr[row].length ; col++ ){
                arr[row][col] = input.nextInt();
            }

        }

    }
}
