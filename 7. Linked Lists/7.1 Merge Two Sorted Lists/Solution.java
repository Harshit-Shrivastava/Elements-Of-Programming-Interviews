public class Solution {
    public ListNode<Integer> mergeSortedLists(ListNode<Integer> L1, ListNode<Integer> L2) {
        ListNode<Integer> dummyHead = new ListNode<>(0, null);
        ListNode<Integer> current = new ListNode<>();

        while (L1 != null && L2 != null) {
            if (L1.data <= L2.data) {
                current.next = L1;
                L1 = L1.next;
            } else {
                current.next = L2;
                L2 = L2.next;
            }
            current = current.next;
        }

        //append remaining nodes of L1 or L2
        current.next = L1 != null ? L1 : L2;
        return dummyHead.next;
    }
}
