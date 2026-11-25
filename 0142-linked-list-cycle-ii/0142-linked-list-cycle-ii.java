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
    public ListNode detectCycle(ListNode h) {
       ListNode s=h;
       ListNode f=h;

       while(f!=null && f.next!=null){
        s=s.next;
        f=f.next.next;

        if(s==f){
            s=h;
            while(s!= f){
                s=s.next;
                f=f.next;
            }
            return s;

        }
       }
       return null;
    
    }
}