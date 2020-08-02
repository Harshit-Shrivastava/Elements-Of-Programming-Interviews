<<<<<<< HEAD
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        // maintain an unchanging reference to the node ahead of the return node
        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;

        while ((l1 != null ) && (l2 != null)) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        // exactly one of l1 and l2 can be non-null at this time, so connect
        // the non-null list to the end of the merged list
        prev.next = (l1 == null ? l2 : l1);

        return prehead.next;

=======
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
>>>>>>> bc1097b660011c176cf5400f2b1b333782174e48
    }
}
