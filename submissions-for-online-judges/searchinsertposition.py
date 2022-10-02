# https://leetcode.com/problems/search-insert-position/
class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        x = nums.count(target)
        
        if x == 0:
            nums.append(target)
            nums.sort()
            return nums.index(target)
        return nums.index(target)
