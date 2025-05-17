class Solution {
  public:
    int eq(int a, int b, int c, int x){
        return (a*(x*x))+(b*x)+c;
    }
    vector<int> sortArray(vector<int> &arr, int A, int B, int C) {
        // code here
        int i=0;
        for(auto ii : arr){
            arr[i++]=(eq(A,B,C,ii));
        }
        sort(arr.begin(), arr.end());
        return arr;
    }
};
