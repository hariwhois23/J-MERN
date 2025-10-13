public class Leetcode1342 {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(step(num, 0));

    }

    static int step(int num, int count) {
        if (num == 0) {
            return count;
        }
        if (num % 2 == 0) {
            return step(num / 2, count += 1);
        } else {
            return step(num - 1, count += 1);
        }
    }

}
