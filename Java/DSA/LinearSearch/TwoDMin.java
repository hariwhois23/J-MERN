import java.lang.reflect.Array;

public class TwoDMin {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 123, 124, 1, 32 },
                { 12, 7, 99, 0, 12 },
                { 1, 3, 45, 27, 89 } };
        int ans = TwoDminimum(arr);
        System.out.println(ans);
    }

    static int TwoDminimum(int[][] arr) {
        int min = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < min) {
                    min = arr[row][col];
                    return min;
                }
            }
        }
        return -1;
    }
}
