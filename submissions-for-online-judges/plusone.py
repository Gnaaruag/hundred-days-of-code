# https://leetcode.com/problems/plus-one/
class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        s = ""
        lis = []
        for i in digits:
            s += str(i)
        x = int(s) + 1
        for i in str(x):
            lis.append(i)
        return lis
        
