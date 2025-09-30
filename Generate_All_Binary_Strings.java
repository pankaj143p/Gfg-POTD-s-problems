class Solution {
    private void gen(int i, int n, ArrayList<String>ans, StringBuilder sb){
        if(i>n)return ;
        
        sb.append('0');
        if(i==n)ans.add(sb.toString());
        gen(i+1, n, ans, sb);
        sb.deleteCharAt(sb.length()-1);
        
        sb.append('1');
        if(i==n)ans.add(sb.toString());
        gen(i+1, n, ans, sb);
        sb.deleteCharAt(sb.length()-1);
    }
    public ArrayList<String> binstr(int n) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        gen(1, n, ans, sb);
        return ans;
    }
}
