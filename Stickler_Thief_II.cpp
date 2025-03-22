#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution {
  public:
    int maxSolve(vector<int>& arr, int l, int r){
        int pre2=arr[l];
        int pre1=max(arr[l], arr[l+1]);
        for(int i=l+2; i<r; i++){
            int ans=max(pre1, pre2+arr[i]);
            pre2=pre1;
            pre1=ans;
        }
        return pre1;
    }
    int maxValue(vector<int>& arr) {
        // your code here
        if(arr.size()==1)return arr[0];
        return max(maxSolve(arr, 1, arr.size()), maxSolve(arr,0,arr.size()-1));
    }
};

int main() {

    int t;
    cin >> t;
    cin.ignore();
    while (t--) {
        string input;
        int num;
        vector<int> arr;

        getline(cin, input);
        stringstream s2(input);
        while (s2 >> num) {
            arr.push_back(num);
        }

        Solution ob;
        int res;
        res = ob.maxValue(arr);
        cout << res << "\n"
             << "~" << endl;
    }

    return 0;
}
