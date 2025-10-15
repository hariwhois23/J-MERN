import java.util.ArrayList;

public class FindallOccurences {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 4, 4, 5, 5 };
        int target = 4;
        int index = 0;

        // since the return type is void
        linearsearch(arr, index, target);
        System.out.println(list);

        System.out.println();

        // For return type as ArrayList

        int[] arr1 = { 2, 3, 1, 4, 4, 5, 5 };
        ArrayList<Integer> sol = new ArrayList<>();
        System.out.println(occurences(arr1, 5, 0, sol));

        // Without arguement
        int[] test = { 2, 2, 1, 2 };
        int ind = 0;
        int tar = 2;
        System.out.println(indexCount(test, tar, ind));

    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void linearsearch(int[] arr, int index, int target) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        linearsearch(arr, index + 1, target);

    }

    // Return type ArrayList with an argument as ArrayList
    static ArrayList<Integer> occurences(int[] arr, int target, int index, ArrayList<Integer> ans) {
        if (index == arr.length) {
            return ans;
        }
        if (arr[index] == target) {
            ans.add(index);
        }
        return occurences(arr, target, index + 1, ans);
    }

    // Without any arguement as an ArrayList
    static ArrayList<Integer> indexCount(int[] arr, int target, int index) {

        if (arr.length == index) {
            return new ArrayList<>();
        }
        ArrayList<Integer> result = indexCount(arr, target, index + 1);

        if (arr[index] == target) {
            result.add(0, index); // 0 to add at the beginning of the arraylist
        }

        return result;
    }

}
