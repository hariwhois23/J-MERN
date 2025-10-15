public class sortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4 };
        System.out.println(sortedasc(arr, arr.length - 1));
    }

    static boolean sortedasc(int[] arr, int n) {
        if (n == 1) {
            return true;
        }
        return (arr[n] >= arr[n - 1]) && sortedasc(arr, n - 1);
    }
}
