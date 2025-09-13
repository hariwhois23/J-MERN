
import java.util.*;

public class PrimeDivisors {
    public static void main(String[] args) {
        int num = 17;
        System.out.println(isPrime(num));

        int nm = 60;
        System.out.println(PrimeFactor(nm));

    }

    static ArrayList<Integer> PrimeFactor(int num) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                if (isPrime(i)) {
                    ans.add(i);
                }
                if (num / i != num) {
                    if (isPrime(num / i)) {
                        ans.add(num / i);
                    }
                }
            }

        }
        return ans;

    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int count = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                count++;
                if (num / i != i) {
                    count++;
                }

            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

}
