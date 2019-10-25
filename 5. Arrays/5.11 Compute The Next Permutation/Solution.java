public class Solution {
    public static List<Integer> nextPermutation(List<Integer> perm) {
        // Find the first entry from right that is smaller than the entry
        // immediately after import junit.framework.TestCase;
        int inversionPoint = perm.size() - 2;
        while (inversionPoint >=0 && perm.get(inversionPoint) >= perm.get(inversionPoint + 1)) {
            --inversionPoint;
        }

        // perm is the last permutation
        if (inversionPoint == -1) {
            return Collections.emptyList();
        }

        // swap the smallest entry after index inversionPoint that is greater than
        // perm.get(inversionPoint). Since entries in perm are decreasing after inversionPoint,
        // if we search in reverse order, the first entry that is greater than
        // perm.get(inversionPoint) is the entry to swap with
        for (int i = perm.size() - 1; i > inversionPoint; --i) {
            if (perm.get(i) > perm.get(inversionPoint)) {
                Collections.swap(perm, inversionPoint, i);
                break;
            }
        }

        // Entries in perm must appear in decreasing order after inversionPoint, so
        // we simply reverse these entries to get the smallest dictionary order
        Collections.reverse(perm.subList(inversionPoint + 1, perm.size()));
        return perm;
    }
}
