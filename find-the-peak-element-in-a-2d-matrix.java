class Solution {
    public ArrayList<Integer> findPeakGrid(int[][] mat) {
        // code here
        int r=0,c=0,mx=-(int)1e6+1;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mx<mat[i][j]){
                    mx=mat[i][j];
                    r=i;
                    c=j;
                }
            }
        }
        al.add(r);
        al.add(c);
        return al;
    }
}
