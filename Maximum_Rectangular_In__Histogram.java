
import java.util.*;
class Solution
{
      public static long getMaxArea(long hist[], long n) 
    {
       long mx=0;
        
        Stack<Integer>st=new Stack<>();
        
        long nxr[]=new long[(int)n];
        
        for(int i=(int)n-1;i>=0;i--){
            
            while(!st.isEmpty()&&hist[st.peek()]>=hist[i]){
                st.pop();
            }
            
            if(!st.isEmpty()){
                nxr[i]=st.peek();
            }else{
                nxr[i]=(int)n;
            }
            st.push(i);
        }
  
        
        st=new Stack<>();
        
        long nxl[]=new long[(int)n];
        
        for(int i=0;i<(int)n;i++){
            
            while(!st.isEmpty()&&hist[st.peek()]>=hist[i]){
                st.pop();
            }
            
            if(!st.isEmpty()){
                nxl[i]=st.peek();
            }else{
                nxl[i]=-1;
            }
            st.push(i);
        }
        
        for(int i=0;i<(int)n;i++){
            mx=Math.max(mx,(hist[i]*(nxr[i]-nxl[i]-1)));
        }
        return mx;
    }
  
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    
    int t=sc.nextInt();
    while(t--){
      
      long n=sc.nextLong();
      
      long hist[]=new long[(int)n];
      
      for(int i=0;i<(int)n;i++){
        hist[i]=sc.nextLong();
      }
      
      System.out.println(getMaxArea(hist,n));
    }
  }
        
}

