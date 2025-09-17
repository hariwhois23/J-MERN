import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SieveOfEratosthenes {

    public static List<Integer> findPrimes(int n) {

        boolean[] isPrime = new boolean[n + 1]; // n+1 because 0 has to be included
        Arrays.fill(isPrime, true); // Assume all numbers are prime initially

        // 0 and 1 are not prime numbers
        isPrime[0] = false;
        isPrime[1] = false;

        for (int p = 2; p * p <= n; p++) {

            if (isPrime[p]) {
                // Mark all multiples of p as not prime
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        int limit = 30; // Find primes up to 30
        List<Integer> primeNumbers = findPrimes(limit);
        System.out.println("Prime numbers up to " + limit + ": " + primeNumbers);

        limit = 100; // Find primes up to 100
        primeNumbers = findPrimes(limit);
        System.out.println("Prime numbers up to " + limit + ": " + primeNumbers);
    }
}
