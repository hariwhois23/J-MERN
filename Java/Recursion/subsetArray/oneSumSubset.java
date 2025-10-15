import java.util.ArrayList;

public class oneSumSubset {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 1 };
        int target = 2;
        int index = 0;
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();

        boolean found = subset(arr, index, sum, target, list);
        if (!found) {
            System.out.println("The match is not found");
        }

    }

    // returns when one sum -> subset is found
    static boolean subset(int[] arr, int index, int sum, int tgSum, ArrayList<Integer> list) {
        if (arr.length == index) {
            if (tgSum == sum) {
                System.out.println(list);
                return true;
            }
            return false;
        }
        list.add(arr[index]);
        sum += arr[index];
        if (subset(arr, index + 1, sum, tgSum, list)) {
            return true;
        }

        sum -= arr[index];
        list.remove(list.size() - 1);
        if (subset(arr, index + 1, sum, tgSum, list)) {
            return true;
        }

        return false;
    }

}
