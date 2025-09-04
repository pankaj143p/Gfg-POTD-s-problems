
class Solution
{
    public static Node reverseKGroup(Node node, int k)
    {
       
        if(node==null)
        return null;
        Node temp=null;
        Node curr=node;
        Node pre=null;
        int j=0;
        while(curr!=null&&j<k){
            temp=curr.next;
            curr.next=pre;
            pre=curr;
            curr=temp;
            j++;
        }
        if(temp!=null){
            node.next=reverseKGroup(temp,k);
        }
        return pre;
        
    }
}
