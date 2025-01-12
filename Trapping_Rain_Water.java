
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().maxWater(arr));
            System.out.println("~");
        }
    }
}
class Solution {
    public int maxWater(int arr[]) {
        // code here
        int l=0,r=arr.length-1;
        int ans=0;
        int mxl=arr[0],mxr=arr[r];
        while(l<=r){
            if(arr[l]<arr[r]){
                if(arr[l]>mxl){
                    mxl=arr[l];
                }else{
                    ans+=(mxl-arr[l]);
                    l++;
                }
            }else{
                 if(arr[r]>mxr){
                    mxr=arr[r];
                }else{
                    ans+=(mxr-arr[r]);
                    r--;
                }
            }
        }
        return ans;
    }
}
