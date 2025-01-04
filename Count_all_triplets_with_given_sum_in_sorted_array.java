
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            int target = Integer.parseInt(sc.nextLine());

            Solution ob = new Solution();
            int ans = ob.countTriplets(arr, target);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

class Solution {
    public int countTriplets(int[] arr, int target) {
        // Code Here
        int sum=0,cnt=0,n=arr.length;
        // int i=0,j=n-1;
        for(int i=0; i<n-2; i++){
            int l=i+1,r=n-1;
            while(l<r){
                int curr=arr[i]+arr[l]+arr[r];
                if(curr==target){
                    cnt++;
                    // l++;
                    // r--;
                    int t=l+1;
                    while(t<r && arr[t]==arr[t-1]){
                        cnt++;
                        t++;
                    }
                    r--;
                }else if(curr>target){
                    r--;
                }else{
                    l++;
                }
            }
        }
        return cnt++;
    }
}
