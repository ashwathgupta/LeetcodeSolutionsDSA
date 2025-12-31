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
    public ListNode deleteDuplicates(ListNode head) {

        
        if(head==null) return null;
        if(head.next==null) return head;

        ListNode first=head;
        ListNode prev=head;

        head=head.next;
        if(head.next==null)
        {
            if(prev.val==head.val)
            {
                prev.next=null;
                return first;
            }
            else{
                return first;
            }
        }
        while(head.val==prev.val)
        {
            if(head.next==null)
            {
                prev.next=null;
                return first;
            }
            head=head.next;
        }
        prev.next=head;

        while(head.next!=null)
        {
            if(prev.val==head.val)
            {
                while(head.val==prev.val)
                {
                    if(head.next==null)
                    {
                        prev.next=null;
                        return first;
                    }
                    head=head.next;
                }
                prev.next=head;
                
            }
            prev=head;
            if(head.next!=null)
                head=head.next;
        }
        if(prev.val==head.val)
        {
            prev.next=null;
            return first;
        }
        return first;
        
    }
}
