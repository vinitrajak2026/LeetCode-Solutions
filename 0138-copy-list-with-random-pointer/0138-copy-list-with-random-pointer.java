/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node h) {
       if(h==null) {
        return null;
       }
       HashMap<Node,Node> m=new HashMap<>();
       Node c=h;
       while(c!=null){
        m.put(c,new Node(c.val));
        c=c.next;
       }
       c=h;
       while(c!=null){
        Node copy=m.get(c);
        copy.next=m.get(c);
        copy.next=m.get(c.next);
        copy.random=m.get(c.random);
        c=c.next;
       }
       return m.get(h);
    }
}