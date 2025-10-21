class Solution {
    public ArrayList<Integer> topKFreq(int[] arr, int k) {
        // Code here
        Map<Integer,Integer> map = new HashMap<>();
        for(int val:arr){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->{
            if(map.get(b).equals(map.get(a))){
                return b-a;
            }else{
                return map.get(b)-map.get(a);
            }
        });
        ArrayList<Integer>ans = new ArrayList<>();
        for(int i=0; i<k && i<list.size(); i++){
            ans.add(list.get(i));
        }
        return ans;
    }
}
