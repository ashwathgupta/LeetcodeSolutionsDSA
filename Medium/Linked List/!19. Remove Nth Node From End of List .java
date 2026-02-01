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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;

        HashMap<Integer, ListNode> hm = new HashMap<>();
        ListNode curr = head;
        int i = 1;

        while (curr != null) {
            hm.put(i, curr);
            curr = curr.next;
            i++;
        }

        int len = i - 1;
        if (n == len) return head.next; // remove head

        ListNode prev = hm.get(len - n); // node before target
        prev.next = prev.next.next;

        return head;
    }
}
// There is another more efficient approach in 1st pass which you can do, come back and find out.