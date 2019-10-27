public class Solution {
    public static void RandomSampling(int k, List<Integer> A) {
        Ramdom rand = new Random();
        for (int i = 0; i < k; i++) {
            Collections.swap(A, i, i + rand.nextInt(A.size() - i));
        }
    }
}
