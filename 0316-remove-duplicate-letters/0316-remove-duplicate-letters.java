class Solution {
    public String removeDuplicateLetters(String s) {
        int[] last = new int[26];
        for (int i = 0; i < s.length(); i++) last[s.charAt(i) - 'a'] = i;

        boolean[] used = new boolean[26];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (used[c - 'a']) continue;

            while (sb.length() > 0 && c < sb.charAt(sb.length() - 1)
                   && i < last[sb.charAt(sb.length() - 1) - 'a']) {
                used[sb.charAt(sb.length() - 1) - 'a'] = false;
                sb.deleteCharAt(sb.length() - 1);
            }

            sb.append(c);
            used[c - 'a'] = true;
        }
        return sb.toString();
    }
}