public class Solution {
    public static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();

        // isPrime.get(p) represents if p is prime or not. Initially, set each
        // to true, excepting 0 and 1. Then use seiving to eliminate nonprimes.
        List<Boolean> isPrime = New ArrayList<>(Collections.nCopies(n + 1, true));
        isPrime.set(0, false);
        isPrime.set(1, false);

        for (int p = 0; p < n; p++) {
            if (isPrime.get(p)) {
                primes.add(p);
                // Seive p's multiples
                for (int i = p * 2; i < n; i += p) {
                    isPrime.set(i, false);
                }
            }
        }
        return primes;
    }
}
