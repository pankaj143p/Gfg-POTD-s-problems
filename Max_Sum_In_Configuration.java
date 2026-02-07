class Solution {
    int maxSum(int[] arr) {
        // code here
        int sum=0,sumwi=0;
	for(int i=0;i<n;i++){
	    sum+=A[i];
	    sumwi+=A[i]*i;
	}
	int mxSum=0;
	for(int i=0;i<n;i++){
	    sumwi=sumwi-sum+A[i]*n;
	    mxSum=Math.max(sumwi,mxSum);
	}
	return mxSum;
    }
}
