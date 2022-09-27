// https://leetcode.com/submissions/detail/809817533/
// 27.09
class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        for (int i = s.length() - 1;i >= 0; i--){
            if (s.charAt(i) == ' ' && len == 0) {
                continue;
            }
            if (s.charAt(i) == ' ' && len != 0) {
                break;
            }
            if (Character.isLetter(s.charAt(i))) {
                //System.out.println('t');
                len++;
                continue;
            }
        }
        return len;
    }
}
