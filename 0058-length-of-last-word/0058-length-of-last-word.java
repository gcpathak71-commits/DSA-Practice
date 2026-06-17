class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int l=s.length();
        int la=s.lastIndexOf(' ');
        return l-la-1;
        
        
    }
}