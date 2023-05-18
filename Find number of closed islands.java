import java.util.*;
public  class Find_number_of_closed_islands{
    
    public static void matChecker(int [][]mat,int N,int M,int i,int j){
         if(i<0||j<0||i==N||j==M||mat[i][j]==0)
             return;
             mat[i][j]=0;
             matChecker(mat,N,M,i+1,j);
              matChecker(mat,N,M,i-1,j);
               matChecker(mat,N,M,i,j+1);
                matChecker(mat,N,M,i,j-1);
         
     }
    public static int closedIslands(int[][] matrix, int N, int M)
    {
        int land=0;
         for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                if(matrix[i][j]==1)
                {
                    if(i==0||j==0||i==N-1||j==M-1)
                    {
                        matChecker(matrix,N,M,i,j);
                    }
                }
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(matrix[i][j]==1){
                    land+=1;
                    matChecker(matrix,N,M,i,j);
                }
            }
        }
        return land;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();

        int [][]matrix=new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println(closedIslands(matrix,N,M));
    }
}
