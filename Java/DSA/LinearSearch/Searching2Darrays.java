import java.util.Arrays;

public class Searching2Darrays {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 123, 124, 1, 32 },
                { 12, 7, 99, 0, 12 },
                { 1, 3, 45, 27, 89 } };
        int target = 0;
        int[] ans = twoDsearch(arr, target);
        System.out.println(Arrays.toString(ans)); //
    }

    static int[] twoDsearch(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col }; // initailizing and giving output in an array
                }
            }
        }
        return new int[] { -1, -1 };
    }

}
