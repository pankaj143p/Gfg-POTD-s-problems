class Solution {
    public String minWindow(String s1, String s2) {
        // code here
        int i=0;
        int j=0;
        int n=s1.length();
        int m=s2.length();
        int st=0;
        int ed=0;
        String ss=s1+":";
        boolean flag=true;
        for(int k=0; k<n; k++){
            i=k;
            j=0;
        while(i<n && j<m){
            if(s1.charAt(i)==s2.charAt(j)){
                // if(flag){
                    st=i;
                    // flag=false;
                // }
                j++;
            }
            i++;
        }
            if(j==m){
              if(i-k<ss.length()){
                  ss=s1.substring(k,i);
              }
          }
        }
        return ss.equals(s1+":") ? "" : ss;
    }
}
