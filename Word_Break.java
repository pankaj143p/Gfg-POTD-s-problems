import java.util.*;
class WordOrStr
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        
        int n=sc.nextInt();
        String s=sc.next();
        ArrayList<String>dic=new ArrayList<>();
        for(int i=0;i<n;i++){
            String str=sc.next();
            dic.add(str);
        }
        System.out.println(wordBreak(n,s,dic));
        }
    }
    // public static String sortStr(String str){
    //     char ch[]=str.toCharArray();
    //     Arrays.sort(ch);
    //     StringBuilder sb = new StringBuilder();
    //     for(int i=0;i<ch.length;i++){
    //         sb.append(ch[i]);
    //     }
    //     return sb.toString();
    // }
    public static int wordBreak(int n, String s, ArrayList<String> dictionary )
    {
        //code here
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<dictionary.size();i++){
            sb.append(dictionary.get(i));
            }
            
            
        // }
        
        String temp=sb.toString();
        // String str1=sortStr(temp);
        // String str2=sortStr(s);
        // System.out.println(str1+" "+str2);
        // if(str1.contains(str2)){
        //     return 1;
        // }
        Set<String> ws = new HashSet<>(dictionary);
        int N = s.length();
        boolean[] dp = new boolean[N + 1];
        dp[0] = true;

        for (int i=1;i<=N;i++) {
            for (int j=0;j<i;j++) {
                if (dp[j]&&ws.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }

        return dp[N] ?1:0;
        // return 1;
        
    }
}
