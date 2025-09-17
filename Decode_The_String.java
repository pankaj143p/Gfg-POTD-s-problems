


class Solution {
    static String decodeString(String s) {
        // code here
        Stack<Integer>val=new Stack<>();
        Stack<Character>stack=new Stack<>();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();){
            char ch=s.charAt(i);
            if(ch>='0'&&ch<='9'){
                StringBuilder str=new StringBuilder();
                while(ch>='0'&&ch<='9'){
                    str.append(ch);
                    i++;
                    ch=s.charAt(i);
                }
                int cnt=Integer.parseInt(str.toString());
                val.push(cnt);
            }else if(ch==']'){
                StringBuilder str=new StringBuilder();
                while(!stack.isEmpty()&&stack.peek()!='['){
                    char ch1=stack.pop();
                    str.append(ch1);
                }
                stack.pop();
                int times=val.pop();
                str.reverse();
                for(int j=0;j<times;j++){
                    for(int k=0;k<str.length();k++){
                        stack.push(str.charAt(k));
                    }
                }
                i++;
            }else{
                stack.push(ch);
                i++;
            }
        }
       while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }
}
