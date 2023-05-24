import java.util.*;
public class Main {
    public static int getMaximum(int N, int[] arr) {
        // code here
        long cnt=0;
        long sum=0;
        for(int k:arr){
            sum+=k;
        }
        for(int i=N;i>=1;i--){
         //   if(arr[i]!=1)
            if(sum%i==0){
                cnt=i;
                break;
            }
            
        }
        return (int)cnt;
    }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int []arr=new int[N];
    for(int i=0;i<N;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println(getMaximum(N,arr));
  }
}
        
