public class CheckArrayisSorted {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 3, 3, 41, 45 };
        boolean sol = SortCheck(arr);
        System.out.println(sol);

    }

    static boolean SortCheck(int[] arr) {
        int n = arr.length;
        boolean ans = true;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] <= arr[i]) {
                continue;
            } else {
                ans = false;
            }
        }
        return ans;
    }

}
