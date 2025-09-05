public class UnorderdLinearSearch {

    public static void main(String[] args) {
        int[] arr = { 12, 32, 14, 12, 421, 3, 12 };
        int target = 421;
        int index = Linear(arr, target);
        System.out.println(target + " is found in the index: " + index);

    }

    static int Linear(int[] arr, int target) {
        int length = arr.length - 1;
        for (int i = 0; i <= length; i++) {
            if (arr[i] == target) {
                return i;
            }

        }
        return -1;
    }

}