class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        Node n1=head;
        Node n2=head;
        int cnt=0;
        while(n1!=null && n2!=null && n2.next!=null){
            // cnt++;
            n1=n1.next;
            n2=n2.next.next;
            if(n1==n2){cnt=1;
            n1=n1.next;
            while(n1!=n2){
                cnt++;
                n1=n1.next;
            }
            return cnt;
         }
            
        }
        return 0;
    }
}
