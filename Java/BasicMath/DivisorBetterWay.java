import java.util.ArrayList;
import java.util.Collections;

public class DivisorBetterWay {
    public static void main(String[] args) {
        double ans = (int) Math.sqrt(12);
        System.out.println(ans);
        int num = 36;
        ArrayList<Integer> divisors = Divisors(num); // capture return value
        System.out.println(divisors);

    }

    static ArrayList<Integer> Divisors(int num) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(num); i++) { // instead of the math.sqrt() we can use the (i * i <= n) condition in the loop
            if (num % i == 0) { // 1,2,3,4,6
                result.add(i);
                if (num / i != i) { // 36,18,12,9
                    result.add(num / i);

                }
            }

        }
        return result;
    }
}