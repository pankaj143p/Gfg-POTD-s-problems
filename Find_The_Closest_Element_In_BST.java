
 class Solution
{
    static int minDiff(Node  root, int k) 
    { 
     if(root==null)
         return Integer.MAX_VALUE;
     
     if(root.data==k)
         return 0;
     
     if(root.data>k)
         return Math.min(Math.abs(k-root.data),minDiff(root.left,k));
     
     if(root.data<k)
         return Math.min(Math.abs(k-root.data),minDiff(root.right,k));
     
     return Integer.MAX_VALUE;
    } 
}
