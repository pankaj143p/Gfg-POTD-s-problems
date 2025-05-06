class Solution
{
    public static void hf(Node root,int i,ArrayList<Integer>al){
        if(root==null)return ;
        if(al.size()==i)al.add(root.data);
        hf(root.left,i+1,al);
        hf(root.right,i+1,al);
    }
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
        ArrayList<Integer>al = new ArrayList<>();
        hf(root,0,al);
        return al;
     
    }
}
