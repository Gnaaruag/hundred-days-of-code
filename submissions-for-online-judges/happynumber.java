// https://leetcode.com/problems/happy-number/
class Solution {
    public static int sumOfSquares(int number) {
        int sum = 0;
        while (number > 0) {
            int rem = number % 10;
            sum += rem * rem;
            number = number / 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        ArrayList<Integer> checkrep = new ArrayList<>();
        boolean cond = true;
        while (n!= 1 && !checkrep.contains(n)) {
            checkrep.add(n);
            n = sumOfSquares(n);
        }
        return (n==1)?true:false;
        
    }
}
