import java.util.*;
class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
 
        // for(int i=n-1;i>=;i--)
        int []ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=arr[n-1-i];
        }
        return ans;
    }
  public static void printArr(int arr[],int k){
    for(int i=0;i<k;i++){
       System.out.print(arr[i]+" ");
    }
     System.out.println();
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      int n=sc.nextInt();
      int []arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      System.out.println(kLargest(arr,n,k));
      printArr(a,k);
    }
  }
}
