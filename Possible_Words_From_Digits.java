class Solution {
 private void gen(int arr[], int i, HashMap<Integer, String> hm, StringBuilder sb, ArrayList<String>ans){
    if(i >= arr.length){
        ans.add(sb.toString());
        return ;
    }
    if(arr[i]==0 || arr[i]==1){
        gen(arr, i+1, hm, sb, ans);
        return;
    }
    String str = hm.get(arr[i]);
    for(int j=0; j<str.length(); j++){
        sb.append(str.charAt(j));
        gen(arr, i+1, hm, sb, ans);
        sb.deleteCharAt(sb.length()-1);
    }
}


    public ArrayList<String> possibleWords(int[] arr) {
        // code here
        HashMap<Integer, String> hm = new HashMap<>();
        ArrayList<String> ans = new ArrayList<>();
        hm.put(2, "abc");
        hm.put(3, "def");
        hm.put(4, "ghi");
        hm.put(5, "jkl");
        hm.put(6, "mno");
        hm.put(7, "pqrs");
        hm.put(8, "tuv");
        hm.put(9, "wxyz");
        
        gen(arr, 0, hm, new StringBuilder(), ans);
        return ans;
    }
}
