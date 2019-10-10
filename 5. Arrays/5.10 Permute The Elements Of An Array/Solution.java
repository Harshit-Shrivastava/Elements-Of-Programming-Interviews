public class Solution {
    public static void applyPermutation(List<Integer> perm, List<Integer> A) {
        for (int i = 0; i < A.size(); i++) {
            while(perm.get(i) != i) {
                Collections.swap(A, i, perm.get(i));
                Collections.swap(perm, i, perm.get(i));
            }
        }
    }
}
