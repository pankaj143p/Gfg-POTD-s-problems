class Solution
{
    Node primeList(Node head){
        //code here
     Node ans=head;
     while(ans!=null){
         ans.val=getPrime(ans.val);
         ans=ans.next;
     }
     return head;
    }
    int getPrime(int data){
        if(prime(data))
        return data;
        
        int i=0;
        while(true){
            
            if(prime(data-i))
            return data-i;
            if(prime(data+i))
            return data+i;
            i++;
        }
    }
    boolean prime(int num){
        if(num==0||num==1){
            return false;
        }
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
            
        }
        return true;
    }
 }
