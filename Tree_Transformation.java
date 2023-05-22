class Solution {
    public static int solve(int N, int[] p) {
        // code here
        int []degree=new int[N+1];
        int ans=N-1;
        int i;
        for(i=1;i<N;i++){
            degree[i]++;
            degree[p[i]]++;
        }
        for(i=0;i<N;i++){
            if(degree[i]==1){
                ans--;
            }
        }
        if(ans<0){
            return 0;
        }
        return ans;
    }
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	int []p=new int[N];
	for(int i=0;i<N;i++){
	    p[i]=sc.nextInt();
	}
	System.out.println(solve(N,p));
	}   
}
        
