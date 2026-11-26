/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node c=head;
        while(c!=null){
            if(c.child!=null){
                Node next=c.next;
                Node child=flatten(c.child);
                c.next=child;
                child.prev=c;
                c.child=null;
                Node temp=child;
                while(temp.next!=null){
                    temp=temp.next;

                }
                temp.next=next;
                if(next!=null){
                    next.prev=temp;
                }
            }
            c=c.next;
        }
        return head;
        
    }
}