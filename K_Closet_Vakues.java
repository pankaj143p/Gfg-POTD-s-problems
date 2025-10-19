class Solution {
    PriorityQueue<int[]>pq;
    public ArrayList<Integer> getKClosest(Node root, int target, int k) {
        // code here
        ArrayList<Integer>list=new ArrayList<>();
        pq=new PriorityQueue<>((a,b)->Integer.compare(b[0],a[0]));
        Inorder(root,target,k);
        while(!pq.isEmpty()){
            list.add(pq.poll()[1]);
        }
        return list;
    }
    void Inorder(Node root,int tar,int k){
        if(root==null) return;
        Inorder(root.left,tar,k);
        int diff=Math.abs(tar-root.data);
        if(pq.size()<k){
         pq.offer(new int[]{diff,root.data});   
        }else if(pq.peek()[0]>diff){
            pq.poll();
            pq.offer(new int[]{diff,root.data});   
        }else if(pq.peek()[0]==diff && pq.peek()[1]>root.data){
            pq.poll();
            pq.offer(new int[]{diff,root.data});   
        }
        Inorder(root.right,tar,k);
    }
}
