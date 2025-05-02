class Solution {
    public int findMaximum(int[] arr) {
        // code here
        int start=1,end=arr.length-2;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid+1]>arr[mid]) start=mid+1;
            else if(arr[mid-1]>arr[mid]) end=mid-1;
            else return arr[mid];
        }
        
        return Math.max(arr[0],arr[arr.length-1]);
    }
}
