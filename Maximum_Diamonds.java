
import java.util.*;
//User function Template for Java
class Solution {
    static long maxDiamonds(int[] A, int N, int K) {
        // code here
        PriorityQueue<Integer>q=new PriorityQueue<>(Collections.reverseOrder ());
        for(int i=0;i<N;i++){
            q.add(A[i]);
        }
        long mxDio=0;
        int mxEle=0;
        while(K-->0){
            mxEle=q.remove();
            mxDio+=mxEle;
            q.add(mxEle/2);
        }
        return mxDio;
    }
  
  	public static void main(String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
	    int K=sc.nextInt();
	    int A[]=new int[N];
	    for(int i=0;i<N;i++){
	        A[i]=sc.nextInt();
	    }
		System.out.println(A,N,k);
		
	}
};
