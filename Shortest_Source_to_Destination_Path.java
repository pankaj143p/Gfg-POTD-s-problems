//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N, M, x, y;
            String S[] = read.readLine().split(" ");
            N = Integer.parseInt(S[0]);
            M = Integer.parseInt(S[1]);
            int a[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String s[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) a[i][j] = Integer.parseInt(s[j]);
            }
            String s1[] = read.readLine().split(" ");
            x = Integer.parseInt(s1[0]);
            y = Integer.parseInt(s1[1]);
            Solution ob = new Solution();
            System.out.println(ob.shortestDistance(N, M, a, x, y));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int shortestDistance(int N, int M, int A[][], int X, int Y) {
        // code here
        int [][] vis = new int[N][M];
        if(A[0][0] == 0){return -1;}
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0,0});
        vis[0][0] = 1;
        
        while(!q.isEmpty()){
            int temp[] = q.poll();
            int i = temp[0], j = temp[1], dist = temp[2];
            
            if(i == X && j == Y){return dist;}
            
            if(i+1 < N && vis[i+1][j] == 0 && A[i+1][j] == 1){q.add(new int[]{i+1,j,dist+1}); vis[i+1][j] = 1;}
            if(j+1 < M && vis[i][j+1] == 0 && A[i][j+1] == 1){q.add(new int[]{i,j+1,dist+1}); vis[i][j+1] = 1;}
            if(i-1 >= 0 && vis[i-1][j] == 0 && A[i-1][j] == 1){q.add(new int[]{i-1,j,dist+1}); vis[i-1][j] = 1;}
            if(j-1 >= 0 && vis[i][j-1] == 0 && A[i][j-1] == 1){q.add(new int[]{i,j-1,dist+1}); vis[i][j-1] = 1;}

        }
        return -1;        
    }
};
