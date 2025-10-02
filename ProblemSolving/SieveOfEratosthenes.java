public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 100; // Find primes up to 100
        boolean[] isPrime = new boolean[n + 1];

        // Initialize all entries as true. A value in isPrime[i] will
        // finally be false if i is Not a prime, else true.
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                // Mark multiples of p as false
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Print all prime numbers
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}