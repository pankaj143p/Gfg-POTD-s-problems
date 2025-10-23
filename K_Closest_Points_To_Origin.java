class Solution {
    public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
        // code here
        ArrayList<int []> listArr = new ArrayList<>();
        for(int i=0; i<points.length; i++){
            listArr.add(new int[]{points[i][0],points[i][1],(int)(points[i][0]*points[i][0]+points[i][1]*points[i][1])});
        }
        listArr.sort((a, b) -> Integer.compare(a[2], b[2]));
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0; i<k; i++){
            int a=listArr.get(i)[0];
            int b=listArr.get(i)[1];
            ans.add(new ArrayList<>(Arrays.asList(a,b)));
        }
        return ans;
    }
}
