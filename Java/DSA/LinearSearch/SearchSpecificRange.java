
public class SearchSpecificRange {
    public static void main(String[] args) {
        int[] arr = { 121, 12, 4, 12, 23, 234, 121, 1, 2, 4, 1221, 12 };
        int target = 121;
        int st = 3;
        int end = 9;
        int ans = SearchSpecRange(arr, target, st, end);
        System.out.println(ans);

    }

    static int SearchSpecRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }

        }
        return -1;
    }

}
