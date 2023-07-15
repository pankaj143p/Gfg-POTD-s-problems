//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t-->0)
        {
            int sizeOfStack =sc.nextInt();
            Stack <Integer> myStack=new Stack<>();
            
            //adding elements to the stack
            for(int i=0;i<sizeOfStack;i++)
            {
                int x=sc.nextInt();
                myStack.push(x);
                
            }
                Solution obj=new Solution();
                obj.deleteMid(myStack,sizeOfStack);
                
                while(!myStack.isEmpty())
                {
                    System.out.print(myStack.peek()+" ");
                    myStack.pop();
                }
                System.out.println();
        }
        
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
   public void deleteMid(Stack<Integer> stack, int sizeOfStack) {
    if (stack.isEmpty() || sizeOfStack <= 0) {
        return; 
    }
    
    int mid = (sizeOfStack / 2) + 1;
    deleteMidUtil(stack, mid);
}

private void deleteMidUtil(Stack<Integer> stack, int current) {
    if (current == 1) {
        stack.pop();
        return;
    }
    
    int temp = stack.pop();
    deleteMidUtil(stack, current - 1);
    stack.push(temp);
}

   
}

