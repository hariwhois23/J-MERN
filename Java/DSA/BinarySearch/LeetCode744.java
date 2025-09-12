public class LeetCode744 {
    public static void main(String args[]) {
        char[] arr = {'c','f','j'}; //Test case 3 {'x,'x,'y','y'} Target = 'z'
        System.out.println("Solution: " + NearbyChar(arr, 'c'));

    }

    static char NearbyChar(char[] letters, char target) {
        if (target >= letters[letters.length - 1]) {
            return letters[0];
        }

        int start, end;
        start = 0;
        end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start];
    }
}
