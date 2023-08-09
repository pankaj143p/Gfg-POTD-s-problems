//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.largestPrimeFactor(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long largestPrimeFactor(int n) {
        // code here
          int max = Integer.MIN_VALUE;
        while(n%2==0){
            max = 2;
            n = n/2;
        }
        if(isprime(n) == true) return  n;
        for(int i = 3; i< Math.sqrt(n)+2; i+=2){
            while(n%i==0){
                max = Math.max(max,i);
                n/=i;
            }

        }
            max = Math.max(max,n);

        return  max;
    }
        
    
    static boolean isprime(int n){
        if(n<=1) return false;
        else{
            for(int i = 2; i<=n/2; i++){
                if(n%i==0) return false;
            }
        }
        return true;
    }
}
