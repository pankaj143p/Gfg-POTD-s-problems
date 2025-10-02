class Solution {
    private void gen(ArrayList<ArrayList<Integer>> al, ArrayList<Integer>temp, int i, int n, int k){
       
        if(temp.size()==k && n==0){
            al.add(new ArrayList<>(temp));
            return ;
        }
         if(n<0 || temp.size()>k){
            return ;
        }
        
        for(int j=i; j<=9; j++){
            temp.add(j);
            gen(al, temp, j+1, n-j, k);
            temp.remove(temp.size()-1);
        }
    }
    public ArrayList<ArrayList<Integer>> combinationSum(int n, int k) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        gen(result, new ArrayList<>(), 1, n, k);
        return result;
    }
}
