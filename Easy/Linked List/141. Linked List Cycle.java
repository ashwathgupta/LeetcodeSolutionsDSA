/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode first=head;
        if(head==null) return false;
        if(head.next==null) return false;
        
        while(head.next!=null)
        {
            
            if(head.val==-98)
            {
                return true;
            }
            head.val=-98;
            head=head.next;
        }
    
        return false;
    }
}
/*
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 /*
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        
        ListNode slow = head;  // Tortoise
        ListNode fast = head;  // Hare
        
        while (fast != null && fast.next != null) {
            slow = slow.next;         // Move slow pointer by one step
            fast = fast.next.next;    // Move fast pointer by two steps
            
            // If slow and fast pointers meet, there's a cycle
            if (slow == fast) {
                return true;
            }
        }
        
        return false;  // No cycle detected
    }
}
*/
