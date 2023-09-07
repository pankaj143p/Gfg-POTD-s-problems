//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int start = sc.nextInt();
            int end = sc.nextInt();

            Solution ob = new Solution();
            int ans = ob.minimumMultiplications(a, start, end);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Tit{
    int fees;
    int fine;
    Tit(int fees,int fine){
        this.fees=fees;
        this.fine=fine;
    }
}
class Solution {
    int minimumMultiplications(int[] kuchBhi, int aao, int jao) {

        // Your code here
        int pay = 100000;
        if(aao == jao){
            return 0;
        }
        int fass_gaye_yrr=-1;
        Queue<Tit>clg_se_pareshan = new LinkedList<>();
        int addmision[] = new int[pay];
        clg_se_pareshan.add(new Tit(0,aao));
        while(clg_se_pareshan.size()>0){
            Tit no = clg_se_pareshan.remove();
            int baago = no.fees;
            int run = no.fine;
            
            for(int confusion=0; confusion<kuchBhi.length;confusion++){
                long dekhte_hai = kuchBhi[confusion]*run%pay;
                int ab_kya_kare = (int)dekhte_hai;
                if(ab_kya_kare==jao){
                    return baago+1;
                    
                }
                if(addmision[ab_kya_kare]==0){
                    clg_se_pareshan.add(new Tit(baago+1,ab_kya_kare));
                    addmision[ab_kya_kare]=1;
                }
                
            }
            
        }
        return fass_gaye_yrr;
        
        
        
    }
}
