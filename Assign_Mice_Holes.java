class Solution {
    public int assignHole(int[] mices, int[] holes) {
        // code here
        Arrays.sort(mices);
        Arrays.sort(holes);
        int mx=0;
        for(int i=0; i<mices.length; i++){
            mx=Math.max(mx, Math.abs(mices[i]-holes[i]));
        }
        return mx;
    }
};
