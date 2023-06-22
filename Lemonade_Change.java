import java.util.*;
class Solution {
public static boolean lemonadeChange(int N, int[] bills) {
    int five = 0, ten = 0;
    for (int bill : bills) {
        if (bill == 5) {
            five++;
        } else if (bill == 10) {
            if (five == 0) return false;
            five--;
            ten++;
        } else {
            if (ten > 0 && five > 0) {
                ten--;
                five--;
            } else if (five >= 3) {
                five -= 3;
            } else {
                return false;
            }
        }
    }
    return true;
}
public static void main(string[]args){
Scanner sc=new Scanner(System.in);
  int N=sc.nextInt();
  int bills[]=new int[N];
  for(int i=0;i<N;i++){
    bills[i]=sc.nextInt();
    
  }
System.out.println((N,bills));
}
}
