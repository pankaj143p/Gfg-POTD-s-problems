//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends




class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
         StringBuilder ans = new StringBuilder();
        Queue<Character> queue = new LinkedList<>();
 
        Map<Character, Integer> charCountMap = new HashMap<>();
 
 
        for(int i = 0; i < A.length(); i++) {
 
          char c = A.charAt(i);
          charCountMap.put(c, charCountMap.getOrDefault(c, 0)+1);
          queue.add(c);
          while(!queue.isEmpty()) {
 
             if(charCountMap.containsKey(queue.peek()) &&
                charCountMap.get(queue.peek()) > 1)  {
 
                 queue.poll();
 
             } else {
 
                  break;
             }
          }
 
           if(queue.isEmpty()) {
                 ans.append('#');
           } else {            
                 ans.append(queue.peek());
           }
       }
 
       return ans.toString();
    }
}
