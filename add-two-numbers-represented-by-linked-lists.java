/* node for linked list

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
    static Node addTwoLists(Node num1, Node num2) {
        // code here
        int sum=0;
        int carry=0,rem=0;
        num1=reverseNode(num1);
        num2=reverseNode(num2);
        Node ans=new Node(0);
        Node temp=ans;
        while(num1!=null || num2!=null || carry!=0){
            int a=(num1!=null) ? num1.data : 0;
            int b=(num2!=null) ? num2.data : 0;
            sum=carry+a+b;
            // rem=sum%10;
            temp.next=new Node(sum%10);
            carry=sum/10;
            temp=temp.next;
            if(num1!=null)num1=num1.next;
            if(num2!=null)num2=num2.next;
        }
        return trimZero(reverseNode(ans.next));
    }
    private static Node reverseNode(Node head){
       Node curr=head;
       Node prev=null;
       while(curr!=null){
           Node next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
       }
       head=prev;
       return prev;
       
    }
     
    private static Node trimZero(Node head){
        Node cur = head;
        while(cur != null && cur.data == 0){
            cur = cur.next;
        }
        return cur;
    }
}
