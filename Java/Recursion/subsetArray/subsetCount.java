import java.util.ArrayList;

public class subsetCount {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 1 };
        int tgSum = 2;
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(count(arr, 0, 0, tgSum, list));

    }

    static int count(int[] arr, int index, int sum, int tgtSum, ArrayList<Integer> list) {
        if (arr.length == index) {
            if (sum == tgtSum) {
                return 1; // if any match is found
            }
            return 0; // if no match is found
        }

        list.add(arr[index]);
        sum += arr[index];
        int include = count(arr, index + 1, sum, tgtSum, list);

        sum -= arr[index];
        list.remove(list.size() - 1);
        int exclude = count(arr, index + 1, sum, tgtSum, list);

        return include + exclude;
    }

}
