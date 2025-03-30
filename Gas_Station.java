class Solution {
    public int startStation(int[] gas, int[] cost) {
        // Your code here
        int curr=0,t=0,idx=0;
        for(int i=0; i<gas.length; i++){
            curr+=gas[i]-cost[i];
            t+=gas[i]-cost[i]; 
            if(curr<0){
                curr=0;
                idx=i+1;
            }
        }
        return t<0 ? -1 : idx;
    }
}
