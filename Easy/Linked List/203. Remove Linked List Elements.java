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
    public ListNode removeElements(ListNode head, int val) {
       
         if(head==null) return null;
        if(head.next==null)
        {
            if(head.val==val)
                return null;
            else{
                return head;
            }
        }
       

        
        while(head.val==val)
        {
            if(head.next==null) 
            { 
                return null;
            }
            head=head.next;
        } 
        ListNode prev=head;
        ListNode first=head;

        if(head.next==null)
        {   
            return head;
        }

        head=head.next;
        while(head.next!=null)
        {
            if(head.val==val)
            {
               while(head.val==val)
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
            if(head.next!=null)
            {
                prev=head;
                head=head.next;
            }

        }
        if(head.val==val)
        {
            prev.next=null;
            head=null;
        }
        return first;


    }
}
