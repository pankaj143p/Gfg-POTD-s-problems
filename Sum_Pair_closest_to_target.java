

class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
         Arrays.sort(arr);
        int diff=Integer.MAX_VALUE;
        int n=arr.length;
        int a=arr[0];
       int b=arr[n-1];
        List<Integer> ans=new ArrayList<>();
        if(n<=1)
        return ans;
        
        int i=0;
        int j=n-1;
        while(i<j)
        {
            int sum=arr[i]+arr[j];
            int currDiff=Math.abs(sum-target);
            //if the currDiff is equal to diff
            if(diff==currDiff)
            {
                if(Math.abs(arr[i]-arr[j])>Math.abs(a-b))
                {
                    a=arr[i];
                    b=arr[j];
                }
            }
            else if(currDiff<diff)
            {
                diff=currDiff;
                a=arr[i];
                b=arr[j];
            }
            if(target<sum)
            {
                j--;
            }
            else{
                i++;
            }
        }
        ans.add(a);
        ans.add(b);
    return ans;
        
    }
}
