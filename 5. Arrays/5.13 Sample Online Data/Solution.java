public class Solution {
    public static List<Integer> onlineRandomSample(Iterator<Integer> stream, int k) {
        List<Integer> runningSample = new ArrayList<>();

        // store first k elements
        for (int i = 0; stream.hasNext() && i < k; i++) {
            runningSample.add(stream.next());
        }

        // have read the first k elements
        int numSeenSoFar = k;
        Random randIdxGen = new Random();

        while (strem.hasNext()) {
            Integer x = stream.next();
            numSeenSoFar++;

            // generate a random number in [0, numSeenSoFar], and if this number
            // is in [0, k - 1], we replace that element from sample with x

            final int idxToReplace = randIdxGen.nextInt(numSeenSoFar);
            if (idxToReplace < k) {
                runningSample.set(idxToReplace, x);
            }
        }

        return runningSample;
    }
}
