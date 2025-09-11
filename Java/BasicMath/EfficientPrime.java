public class EfficientPrime {
    public static void main(String[] args) {
        int num = 13;
        boolean ans = isPrime(num);
        System.out.println(ans);
    }

    // Time complexity is Square root of N
    static boolean isPrime(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count++;
                if ((num / i) != i) {
                    count++;
                }
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }
}
