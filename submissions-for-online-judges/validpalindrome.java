// https://leetcode.com/problems/valid-palindrome/
class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9\t]", "");
        s = s.toLowerCase();
        // System.out.println(s);
        int x = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            // System.out.println(s.charAt(i));
            // System.out.println(s.charAt(x));
            if (s.charAt(i) == s.charAt(x)) {
                x--;
                continue;
                
            }
            else {
                return false;
            }
        }
        return true;
    }
}
