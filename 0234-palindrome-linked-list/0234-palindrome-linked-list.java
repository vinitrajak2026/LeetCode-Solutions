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
    public boolean isPalindrome(ListNode head) {
      ListNode s= head;
      ListNode f=head;
      //find middle of link list 
   while (f!=null && f.next!=null){
    s=s.next;
    f=f.next.next;
   }
   //reverse second half
   ListNode prev=null;
   ListNode curr=s;

   while(curr!=null){
    ListNode next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;
   }
   //compare both halves
   ListNode first=head;
   ListNode second=prev;

   while(second !=null){
    if(first.val!=second.val){
        return false;
    }
    first=first.next;
    second=second.next;
   }
   return true;
    }
}