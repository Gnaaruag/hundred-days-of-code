// https://leetcode.com/problems/find-k-closest-elements/
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int s = 0, e = arr.length-k;
        
        while(s<e) {
            int mid = (s + e)/2;
            if (x - arr[mid] > arr[mid+k]-x)
                s = mid + 1;
            else
                e = mid;
        }

        List<Integer> kClose = new ArrayList<Integer>();
        for(int i = s; i < s + k ;i++) {
            kClose.add(arr[i]);
        }
        return kClose;
    }
}
