// https://leetcode.com/problems/ransom-note/
// 30.09
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> countChars = new HashMap<>(); 
        for (int i = 0; i < magazine.length(); i++) {
            if (!countChars.containsKey(magazine.charAt(i))) {
                countChars.put(magazine.charAt(i),1);
            }
            else {
                countChars.put(magazine.charAt(i),countChars.get(magazine.charAt(i))+1);
            }
        } 
        for (int i = 0; i < ransomNote.length(); i++) {
            if (!countChars.containsKey(ransomNote.charAt(i))) {
                return false;
            }
            else if (countChars.get(ransomNote.charAt(i)) == 0) {
                return false;
            }
            else {
                countChars.put(ransomNote.charAt(i),countChars.get(ransomNote.charAt(i))-1);
            }
        }
        return true;
    }
}
