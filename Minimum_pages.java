


//Back-end complete function Template for Java

class Solution {
    public static int findPages(int[] nums, int m) {

        int n = nums.length;
        if(m > n){
            return -1;
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start,nums[i]);
            end += nums[i];
        }
        // binary search
        while (start<end){
            int mid = start+ (end -start)/2;
            int sum = 0;
            int pieces = 1;
            for(int num: nums){
                if (sum+num > mid){
                    sum = num;
                    pieces++;

                }  else {
                    sum+= num;
                }
            }
            if(pieces>m){
                start= mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }
          }
