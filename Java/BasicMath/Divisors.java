public class Divisors {
    public static void main(String[] args) {

        int numq = 3123;
        Divisor(numq);

    }

    static void Divisor(int num) {

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);

            }
        }

    }
}
