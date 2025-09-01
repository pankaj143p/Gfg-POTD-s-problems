

class Solution {
    class pair{
        int f,v;
        pair(int f,int v){
            this.f=f;
            this.v=v;
        }
    }
    public int sumOfModes(int[] arr, int k) {
        HashMap<Integer,Integer>mp = new HashMap<>();
        PriorityQueue<pair>pq=new PriorityQueue<>((a,b)->{
           if(a.f==b.f)return a.v-b.v;
           return b.f-a.f;
        });
        int n=arr.length,r=0,j=0;
        for(int i=0;i<k;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
            pq.add(new pair(mp.get(arr[i]),arr[i]));
        }
        for(int i=k;i<n;i++){
            r+=pq.peek().v;
            mp.put(arr[j],mp.getOrDefault(arr[j++],0)-1); //remove
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1); // add
            pq.add(new pair(mp.get(arr[i]),arr[i])); // add
            while(mp.get(pq.peek().v)!=pq.peek().f) pq.remove(); //remove
        }
        r+=pq.peek().v;
        return r;
    }
}


// class Solution {
//     public int sumOfModes(int[] arr, int k) {
//         // code here
//         // k size
//         int n=arr.length;
//         int l=0;
//         int r=0;
//         int fre[] = new int[100001];
//         int mxfre=0;
//         int ele=0;
//         int ans=0;
//         while(r<n){
//             fre[arr[r]]++;
//             if(mxfre<fre[arr[r]]){
//                 mxfre=fre[arr[r]];
//                 ele=arr[r];
//             }else if(mxfre==fre[arr[r]]){
//                 ele=Math.min(ele,arr[r]); 
//             }
//             System.out.print(r+" : --> "+ele+" ------>  ");
//             while(r-l+1>=k){
//                 if(r-l+1==k){
//                      ans+=ele;
//                 }
//                 mxfre=0;
//                 // ele=1000001;
//                 fre[arr[l]]--;
//                 l++;
//             }
//             r++;
//         }
//         return ans;
//     }
// }

