class Solution {
    
    public int BSForLeftBound(int[] arr , int l , int r , int x){
        int left = l;
        int right = r;
        int index = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] < x) left = mid + 1;
            else{
                if(arr[mid] == x) index = mid;
                right = mid - 1;
            }
        }
        return index;
    }
    public int BSForRightBound(int[] arr , int l , int r , int x){
        int left = l;
        int right = r;
        int index = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] > x) right = mid - 1;
            else{
                if(arr[mid] == x) index = mid;
                left = mid + 1;
            }
        }
        return index;
    }
    public ArrayList<Integer> countXInRange(int[] arr, int[][] queries) {
        // code here
        
        ArrayList<Integer> result = new ArrayList<>();
        for(int[] query : queries){
            int l = query[0];
            int r = query[1];
            int x = query[2];
            
            int leftThresholdIdx = BSForLeftBound(arr , l , r , x);
            int rightThresholdIdx = BSForRightBound(arr , l , r , x);
            if( (leftThresholdIdx == -1) &&  (rightThresholdIdx == -1)){
                result.add(0);
            }
            else result.add(Math.abs(rightThresholdIdx - leftThresholdIdx) + 1);
        }
        
        return result;
    }
}
