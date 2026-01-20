class Solution {
    String s = "";
    Stack<Character> st1 = new Stack<>(); 
    Stack<Character> st2 = new Stack<>(); 
    public void append(char x) {
        s = s + x;
        st1.push(x);
    }

    public void undo() {
        if(!st1.isEmpty()){
            st2.push(st1.pop()); 
            s = s.substring(0, s.length()-1);
        }
    }

    public void redo() {
        if(!st2.isEmpty()){
            char c = st2.pop();
            st1.push(c); 
            s = s + c;
        }
    }

    public String read() {
        return s;
    }
}
