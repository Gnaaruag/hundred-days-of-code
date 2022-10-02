// https://leetcode.com/problems/single-number/
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> freqs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!(freqs.containsKey(nums[i]))) {
                freqs.put(nums[i],1);
            }
            else{
                freqs.put(nums[i],freqs.get(nums[i])+1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (freqs.get(nums[i]) == 1) {
                return nums[i];
            }
        }
        return 0;
    }
}
