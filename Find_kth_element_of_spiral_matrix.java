//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
   
    int findK(int matrix[][], int n, int m, int k)
    {
	 
        
         int str=0;
        int edr=n-1;
        int stc=0;
        int edc=m-1;
        int tt=n*m;
        int cnt=0;
        ArrayList<Integer>ans=new ArrayList<>();
        while(cnt<tt){
              for(int i=stc;cnt<tt&&i<=edc;i++){
                ans.add(matrix[str][i]);
                cnt++;
            }
           str++;
            for(int i=str;cnt<tt&&i<=edr;i++){
                ans.add(matrix[i][edc]);
                cnt++;
            }
           edc--;
              for(int i=edc;cnt<tt&&i>=stc;i--){
                ans.add(matrix[edr][i]);
                cnt++;
            }
           edr--;
              for(int i=edr;cnt<tt&&i>=str;i--){
                ans.add(matrix[i][stc]);
                cnt++;
            }
           stc++;
            
        }
        return ans.get(k-1);
        
        
    }
}
