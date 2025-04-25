
class Solution
{
    static int majorityElement(int a[])
    {
    int size = a.length;
       int count=0;
        int element=0;
       for(int i=0;i<size;i++)
     {
         if(count==0){
         element=a[i];
         count=1;
         }
         else if(a[i]==element)count++;
         else count--;
         
        
        }
        int count1=0;
        for(int i=0;i<size;i++)
        {
            if(a[i]==element)count1++;
            
        }
        if(count1>(size/2))
        {
            return element;
        }
      return -1;
    }
}
