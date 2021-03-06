public class BetterSeive {
    public static List<Integer> generatePrimes(int n) {
        if (n < 2) {
            return Collections.emptyList();
        }

        final int size = (int)Math.floor(0.5 * (n - 3)) + 1;
        List<Integer> primes = new ArrayList<>();
        primes.add(2);

        // isPrime.get(i) represents whether (2i + 3) is prime or not
        // eg. isPrime.get(0) represents whether 3 is prime or not,
        // isPrime.get(1) represents whether 5 is prime or not
        // Initially set each to true. Then use seiving to eliminate nonprimes

        List<Boolean> isPrime = new ArrayList<>(Collections.nCopies(size, true));
        for (long i = 0; i < size; i++) {
            if (isPrime.get((int)i)) {
                int p = (((int)i * 2) + 3);
                primes.add(p);

                // Seiving from p^2, whose value is (4i^2 + 12i + 9). The index of this
                // value in isPrime is (2i^2 + 6i + 3) because isPrime.get(i) represents
                // 2i + 3

                // We need to use long type for j because p^2 might overflow
                for (long j = ((i * i) * 2) + 6 * i + 3; j < size; j += p) {
                    isPrime.set((int)j, false);
                }
            }
        }

        return primes;
    }
}
