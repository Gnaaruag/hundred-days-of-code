// https://leetcode.com/submissions/detail/807545218/
// 24.09
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n = strs.length;
        String s = strs[0];
        String l = strs[n-1];
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == l.charAt(i)) {
                i++;
            }
            else{
                break;
            }
        }
        return (i == 0) ? "" : s.substring(0,i);
}
}
