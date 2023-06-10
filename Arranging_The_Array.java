import java.util.*;
class Solution {
    
    public stati void Rearrange(int a[], int n)
    {
       ArrayList<Integer>asd=new ArrayList<>();
         ArrayList<Integer>dsd=new ArrayList<>();
         for(int i=0;i<n;i++){
             if(a[i]<0){
                 dsd.add(a[i]);
             }else{
                 asd.add(a[i]);
             }
         }
       // Collections.sort(dsd);
       // Collections.sort(asd,Collections.reverseOrder());
    int i=0;
    for(int j:dsd){
        a[i++]=j;
    }
       for(int k:asd){
        a[i++]=k;
    }  
    }
      public static void print(int a[],int n){
        for(int i=0;i<n;i++){
          System.out.print(a[i]+" ");
        }
        System.out.println();
      }
        // Your code goes here

  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int []a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    
  }
}
