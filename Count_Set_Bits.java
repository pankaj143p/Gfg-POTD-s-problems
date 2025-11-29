//User function Template for Java

class Solution{
    
    // public static int cntOne(int num){
    //     int c=0;
    //     while(num!=0){
    //         int rem=num%2;
    //         if(rem==1){
    //             c++;
    //         }
    //         num=num/2;
    //     }
    //     return c;
    // }
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
      
        // Your code here
    //      int pow=0;
    //     int ans=0;
    //   int cnt=0;
    //   int c=0;
    //   while(n!=0)
    //   {
    //       int rem=n%2;
    //       ans+=(rem*(int)Math.pow(10,pow));
     
    //       pow++;
    //       n=n/2;
    //          //cnt=cntOne(ans);
             
    //           while(ans!=0){
    //         int re=ans%2;
    //         if(re==1){
    //             c++;
    //         }
    //         ans=ans/2;
    //     }
           
    //   }
    //   return c+n;
    
     if(n==0) return 0;
        int pow = 0, temp = n;
        while(temp>1){
            temp = temp >> 1;
            pow++;
        }
        return (int)Math.pow(2, pow-1)*pow + n-(int)Math.pow(2, pow) + 1 + countSetBits(n-(int)Math.pow(2, pow));
   }
}
