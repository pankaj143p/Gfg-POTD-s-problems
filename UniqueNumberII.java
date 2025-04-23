class Solution
{
    public int[] singleNum(int[] nums)
    {
        // Code here
        int n = nums.length;
        // int m = n/2;
        // int o = m+1;
        // int sum1 = 0, sum2 = 0;
       
        //  for(int i=0;i<m; i++){
        //     sum1+=nums[i];
        // }
        //  for(int i=m; i<n; i++){
        //     sum2+=nums[i];
        // }
        // int sum = (o*(o+1))/2;
        int res[] = new int[2];
        // return res;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : nums){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }else{
                hm.put(i,1);
            }
        }
        int k=0;
        // for(Map.Entry j:hm.entrySet()){
        //     if(j.getValue()==1){
        //         res[k++] = j.getKey();
        //     }
        // }
        for(int l: nums){
            if(hm.get(l)==1){
                res[k++]=l;
            }
        }
        Arrays.sort(res);
        return res;
    }
}
