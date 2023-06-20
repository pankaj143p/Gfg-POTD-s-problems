import java.util.*;
class Solution {
   public static int matchGame(Long N) {
        // code here
        if(N%5==0){
            return -1;
        }
        return (int)(N%5);
    }
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
    long N=sc.nextLong();
    System.out.println(matchGame(N));
  }
};
