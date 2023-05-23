import java.util.*;
class Solution
{
   public  static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int cnt=0,ans=0;
        int j=0;
        int i=0;
        while(i<n){
            if(arr[i]<=dep[j]){
                cnt++;
                
                ans=Math.max(ans,cnt);
                i++;
            }else
            {
                cnt--;
                j++;
            }
        }
        return ans;
    }
  public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    int dep[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
      dep[i]=s.nextInt();
    }
    System.out.println(findPlatform(arr,dep,n));
    
  }
    
}

