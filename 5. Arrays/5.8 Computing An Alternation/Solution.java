public class Solution {
    public static void main rearrange(List<Integer> A) {
        for (int i = 1; i < A.size(); i++) {
            if (((i % 2) == 0 && A.get(i - 1) < A.get(i)) ||
             ((i % 2) != 0 && A.get(i -1 ) > A.get(i))) {
                 Collections.swap(A, i - 1, i);
             }
        }
    }
}
