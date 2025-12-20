class Solution {
    public int searchInsertK(int a[], int x) {
        // code here
       int n=a.length;
       int m;
       int i=0;
       int j=n-1;
       int find=n;
       while(i<=j){
          m=(i+j)/2;
         if(a[m]>=x){
                  find=m;
                  j=m-1;
              }else {
              i=m+1;
       }
          }
       
       return find;
    }
};
