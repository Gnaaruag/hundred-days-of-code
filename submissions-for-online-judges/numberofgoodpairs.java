// https://leetcode.com/submissions/detail/808262354/
// 25.09
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        HashMap<Integer,Integer> gp = new HashMap<>();
        //System.out.println(nums.length);
        for (int i = 0; i < nums.length; i++) {
            //System.out.println(nums[i]);
            if (gp.containsKey(nums[i])) {
                count += gp.get(nums[i]);
                gp.put(nums[i],gp.get(nums[i])+1);
            }
            else {
                gp.put(nums[i],1);
            }
            //System.out.println(gp);
        }
        return count;
    }
}
