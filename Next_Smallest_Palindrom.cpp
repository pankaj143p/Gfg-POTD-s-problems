//{ Driver Code Starts
#include <bits/stdc++.h>

using namespace std;

// } Driver Code Ends
//User function template for C++
class Solution{
public:
vector<int> generateNextPalindrome(int num[], int n) 
{
    vector<int> ans;
    if(n == 1)
    {
        if(num[0] == 9)
        {
            ans.push_back(1);
            ans.push_back(1);
            return ans;
        }
        else
        {
            ans.push_back(num[0] + 1);
            return ans;
        }
    }
    int l = 0;
    int r = n -1;
    bool flag = true;
    bool changed = false;
    while(l < r)
    {
        if(num[r] > num[l])
        {
            num[r] = num[l];
            flag = false;
        }
        else if(num[r] < num[l])
        {
            num[r] = num[l];
            flag = true;
            changed = true;
        }
        l++;
        r--;
    }
    
    if(flag == false || changed == false)
    {
        if(n%2 == 0) 
        {
            l--;
            r++;
        }
        while(num[l] == 9 && num[r] == 9 && l >=0 && r <n)
        {
            num[l] = 0;
            num[r] = 0;
            l--;
            r++;
        }
        if(l <0)
        {
            num[0] = 1;
            for(int i = 0; i< n;i++)
            {
                ans.push_back(num[i]);
            }
            ans.push_back(1);
            return ans;
        }
        
        if(l == r && l >=0 && r <=n)
        {
            num[l] +=1;
        }
        else if (l>=0 && r <=n) 
        {
            num[l] +=1;
            num[r] +=1;
        }
        
    }
    
    for(int i = 0; i< n;i++)
    {
        ans.push_back(num[i]);
    }
    return ans;
}
 
};


//{ Driver Code Starts.


int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        int num[n];
        for (int i = 0; i < n; i++) {
            cin >> num[i];
        }
        Solution ob;
        auto ans = ob.generateNextPalindrome(num, n);
        for (auto x : ans) {
            cout << x << " ";
        }
        cout << "\n";
    }
    return 0;
}

// } Driver Code Ends//{ Driver Code Starts
#include <bits/stdc++.h>

using namespace std;

// } Driver Code Ends
//User function template for C++
class Solution{
public:
vector<int> generateNextPalindrome(int num[], int n) 
{
    vector<int> ans;
    if(n == 1)
    {
        if(num[0] == 9)
        {
            ans.push_back(1);
            ans.push_back(1);
            return ans;
        }
        else
        {
            ans.push_back(num[0] + 1);
            return ans;
        }
    }
    int l = 0;
    int r = n -1;
    bool flag = true;
    bool changed = false;
    while(l < r)
    {
        if(num[r] > num[l])
        {
            num[r] = num[l];
            flag = false;
        }
        else if(num[r] < num[l])
        {
            num[r] = num[l];
            flag = true;
            changed = true;
        }
        l++;
        r--;
    }
    
    if(flag == false || changed == false)
    {
        if(n%2 == 0) 
        {
            l--;
            r++;
        }
        while(num[l] == 9 && num[r] == 9 && l >=0 && r <n)
        {
            num[l] = 0;
            num[r] = 0;
            l--;
            r++;
        }
        if(l <0)
        {
            num[0] = 1;
            for(int i = 0; i< n;i++)
            {
                ans.push_back(num[i]);
            }
            ans.push_back(1);
            return ans;
        }
        
        if(l == r && l >=0 && r <=n)
        {
            num[l] +=1;
        }
        else if (l>=0 && r <=n) 
        {
            num[l] +=1;
            num[r] +=1;
        }
        
    }
    
    for(int i = 0; i< n;i++)
    {
        ans.push_back(num[i]);
    }
    return ans;
}
 
};


//{ Driver Code Starts.


int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        int num[n];
        for (int i = 0; i < n; i++) {
            cin >> num[i];
        }
        Solution ob;
        auto ans = ob.generateNextPalindrome(num, n);
        for (auto x : ans) {
            cout << x << " ";
        }
        cout << "\n";
    }
    return 0;
}

// } Driver Code Ends
