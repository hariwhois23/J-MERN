public class NumberOfSET {
    public static void main(String[] args) {
        System.out.println(setBITS(128));

    }

    static int setBITS(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num >>= 1;
        }

        return count;
    }

}
