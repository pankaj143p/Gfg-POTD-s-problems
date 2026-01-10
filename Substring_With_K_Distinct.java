class Solution {
    private static int atMostK(String s, int k){
        int l=0,r=0,cnt=0,dis=0;
        int fre[] = new int[26];
        for(; r<s.length(); r++){
            if(fre[s.charAt(r)-'a']==0)dis++;
            fre[s.charAt(r)-'a']++;
            while(dis>k){
                fre[s.charAt(l)-'a']--;
                if(fre[s.charAt(l)-'a']==0)dis--;
                l++;
            }
            cnt+=(r-l+1);
        }
        return cnt;
    }
    public int countSubstr(String s, int k) {
        //  code here
        // int l=0,r=0,cnt=0,dis;
        // int fre[] = new int[26];
        // for(; r<s.length(); r++){
        //     if(fre[c.charAt(r)-'a']==0)dis++;
        //     fre[s.charAt(r)-'a']++;
        //     while(dis>k){
        //         fre[s.charAt(l)-'a']--;
        //         if(fre[s.charAt(l)-'a']==0)dis--;
        //         l++;
        //     }
        //     cnt+=(r-l+1);
        // }
        return atMostK(s,k)-atMostK(s, k-1);
    }
}
