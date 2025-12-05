class Solution {
    int minCost(int[][] costs) {
        // code here
        int n = costs.length;
        int k = costs[0].length;
        if(k==1 && n==1) return costs[0][0];
        if(k<=1 || n==0) return -1;
        
        int min = 0, secondMin = -1;
        int minVal = costs[0][0], secondMinVal = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(i!=0){
            for (int j = 0;j<k;j++)costs[i][j] += costs[i-1][j];
            }
            
            min = 0;
            secondMin = -1;
            minVal = costs[i][0];
            secondMinVal = Integer.MAX_VALUE;
            
            //find min and second min
            for (int j = 1; j < k; j++) {

                if (costs[i][j] < minVal) {
                    secondMin = min;
                    secondMinVal = minVal;
                    min = j;
                    minVal = costs[i][j];
                } 
                else if(j != min && (secondMin == -1 || costs[i][j] < secondMinVal)) {
                    secondMin = j;
                    secondMinVal = costs[i][j];
                }
            }
            
            
            for(int j=0;j<k;j++){
                if(j!=min){
                    costs[i][j] = minVal;
                }
                else{
                    costs[i][j] = secondMinVal;
                }
            }
        }
        return minVal;
    }
}
