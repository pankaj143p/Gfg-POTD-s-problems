
/* class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}*/
class Solution {
    static Node segregate(Node head) {
        // code here
        int fre[] = new int[3];
        Node curr=head;
        while(curr!=null){
            fre[curr.data]++;
            curr=curr.next;
        }
        curr=head;
        int i=0;
        while(i<3){
            while(fre[i]-->0){
                curr.data=i;
                curr=curr.next;
            }
            i++;
        }
        return head;
    }
}


