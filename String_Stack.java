class Solution {
    public boolean stringStack(String pat, String tar) {
    if (tar.length() > pat.length()) return false;
    int i=pat.length()-1,j=tar.length()-1;
    while(i>=0 && j>=0){
        if(pat.charAt(i)==tar.charAt(j)){i--;j--;}
        else{i=i-2;}
    }
    if(j>=0){return false;}
    return true;
    }
}


