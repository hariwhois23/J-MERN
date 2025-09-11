
// 744. Find Smallest Letter Greater Than Target
// Easy

// Example 1:

// Input: letters = ["c","f","j"], target = "a"
// Output: "c"
// Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
// Example 2:

// Input: letters = ["c","f","j"], target = "c"
// Output: "f"
// Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
// Example 3:

// Input: letters = ["x","x","y","y"], target = "z"
// Output: "x"
// Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = { 'x','x','y','y' };
        int ans = GreaterThanTarget(arr, 'z');
        System.out.println(ans);

    }

    static int GreaterThanTarget(char[] arr, char target) {
        int st, end;
        st = 0;
        end = arr.length - 1;
        if (target >= arr[arr.length - 1]) {
            return arr[0];
        }

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            }
            if (arr[mid] < target) {
                st = mid + 1;
            }

        }

        return arr[st];

    }
}
