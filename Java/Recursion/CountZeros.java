public class CountZeros {
    public static void main(String[] args) {

        int num = 10200001;
        System.out.println(zeros(num, 0));

    }

    static int zeros(int num, int count) {
        if (num == 0) {
            return count;
        }
        int rem = num % 10;
        if (rem == 0) {
            count += 1;
        }
        return zeros(num / 10, count);

    }

}
