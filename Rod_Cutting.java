import java.util.*;

class Solution{
    public static int cutRod(int price[], int n) {
        //code here
        int dp[]=new int[n+1];
        Arrays.fill(dp,0);
        for(int i=1;i<=n;i++){
            dp[i]=price[i-1];
            for(int j=1;j<i;j++){
                dp[i]=Math.max(dp[i],dp[j]+dp[i-j]);
            }
        }
        return dp[n];
    }


 public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    
    int t=sc.nextInt();
    while(t--){
      
      int n=sc.nextInt();
      
      int price[]=new int[n];
      
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      
      System.out.println(cutRod(arr,n));
    }
  }
        
}
