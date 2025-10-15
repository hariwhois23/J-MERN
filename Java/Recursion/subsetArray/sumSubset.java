import java.util.ArrayList;

public class sumSubset {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 1 };
        int tgSum = 2;
        ArrayList<Integer> list = new ArrayList<>();
        subset(arr, 0, tgSum, 0, list);

    }

    static void subset(int[] arr, int index, int tgSum, int sum, ArrayList<Integer> list) {
        if (arr.length == index) {
            if (tgSum == sum) {
                System.out.println(list);

            }
            return;
        }

        list.add(arr[index]);
        sum += arr[index];
        subset(arr, index + 1, tgSum, sum, list);

        sum -= arr[index];
        list.remove(list.size() - 1);
        subset(arr, index + 1, tgSum, sum, list);

    }

}
