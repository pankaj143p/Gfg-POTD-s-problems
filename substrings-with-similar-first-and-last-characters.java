class Solution {
    public int countSubstring(String s) {
        // code here
        int cnt=0;
        int fre[] = new int[26];
        for(int i=0,j=0; i<s.length(); i++){
            fre[s.charAt(i)-'a']++;
            cnt+=fre[s.charAt(i)-'a'];
        }
        return cnt;
    }
}
