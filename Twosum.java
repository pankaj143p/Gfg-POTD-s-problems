import java.util.*;
public class Twosum {
    public long Sum(long n1,long n2){
        long sum=0;
               while(n2!=0){
                   sum=(n1&n2);
                   n1=n1^n2;
                   n2=sum<<1;
                   
               } 
                return n1;
            }
        
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        long n1,n2;
        n1=S.nextInt();
        n2=S.nextInt();
        Twosum ts=new Twosum();
        System.out.println(ts.Sum(n1,n2));
    }
    
}
