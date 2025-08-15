

// User function Template for Java

class Solution {
    static ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        // code here
        ArrayList<int[]> al=new ArrayList<>();
        boolean added=false;
        for(int i=0;i<intervals.length;i++)
        {
            if(intervals[i][0]<newInterval[0]&&intervals[i][1]<newInterval[0])
            {
                al.add(intervals[i]);
            }
            else if(intervals[i][0]>newInterval[1]&&intervals[i][1]>newInterval[1])
            {
                if(added==false)
                {
                    al.add(newInterval);
                    added=true;
                }
                al.add(intervals[i]);
            }
            else
            {
                newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
                newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            }
        }
        if(added==false)
        {
            al.add(newInterval);
        }
        return al;
    }
}
