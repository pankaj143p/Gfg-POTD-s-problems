import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            
            int k = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] tokens = line.split(" ");

            ArrayList<Integer> array = new ArrayList<>();

            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            int res = new Solution().countSubarrays(arr, k);

            System.out.print(res);
            System.out.println();
            System.out.println("~");
        }
    }
}
class Solution {
    public int countSubarrays(int arr[], int k) {
        // code here
        int sum=0;
        int i=0,j=0,cnt=0;
        HashMap<Integer,Integer> pre = new HashMap<>();
        pre.put(0,1);
        for(int ii : arr){
            sum+=ii;
            if(pre.containsKey(sum-k)){
                cnt+=pre.get(sum-k);
            }
            pre.put(sum,pre.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}
