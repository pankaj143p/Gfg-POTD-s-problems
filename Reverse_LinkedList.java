class Solution {
    public Node reverse(Node head) {
        // code here
        Node curr=head;
        Node pre=null;
        Node next=null;
        while(curr!=null){
        next = curr.next;
        curr.next = curr.prev;
        curr.prev = next;
        if(next==null)
            break;
        curr = next;
        }
        return curr;
    }
}
