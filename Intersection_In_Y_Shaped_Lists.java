/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        Node h1=head1;
        Node h2=head2;
        if(h1==null || h2==null)return null;
        while(h1!=h2){
            h1=(h1==null) ? head1 : h1.next;
            h2=(h2==null) ? head2 : h2.next;
        }
        return h1;
    }
}
