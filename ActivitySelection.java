class Pair{
    int start;
    int end;
    Pair(int start,int end){
        this.start=start;
        this.end=end;
    }
}
class Solution
{
    public static int activitySelection(int start[], int end[])
    {
        int n=start.length;
        List<Pair> intervals = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            intervals.add(new Pair(end[i], start[i]));
        }
        
        intervals.sort(Comparator.comparingInt(a -> a.start));
        
        int cnt = 1;
        int mn = intervals.get(0).start;
        
        for (int i = 1; i < n; i++) {
            if (mn < intervals.get(i).end) {
                cnt++;
                mn = intervals.get(i).start;
            }
        }
        
        return cnt;
        // add your code here
    }
}
