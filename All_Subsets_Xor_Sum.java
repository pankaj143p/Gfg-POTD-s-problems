class Solution {
    int subsetXORSum(int arr[]) {
        // code here
        int or=0;
        for(int ii : arr) or|=ii;
        return or*(int)(Math.pow(2,arr.length-1));
    }
}
