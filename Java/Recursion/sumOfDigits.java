public class sumOfDigits {
    public static void main(String[] args) {
        int num = 1432;
        System.out.println(sum(num));

    }

    static int sum(int num) {
        if (num == 0) {
            return 0;
        }
        return (num % 10) + sum(num / 10); 
    }

}
