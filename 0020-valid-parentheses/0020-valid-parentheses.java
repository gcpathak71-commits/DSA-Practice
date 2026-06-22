class Solution {
    public boolean isValid(String s) {
        Stack<String> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch + ""); 
            } 
            else {
                if (st.isEmpty()) return false;
                
                String top = st.pop();
                if (ch == ')' && !top.equals("(")) return false;
                if (ch == ']' && !top.equals("[")) return false;
                if (ch == '}' && !top.equals("{")) return false;
            }
        } 
        return st.isEmpty();
    }
}