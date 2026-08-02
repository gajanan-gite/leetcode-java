public class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            // If counter is zero, we choose a new candidate
            if (count == 0) {
                candidate = num;
                count = 1;
            } 
            // If current element matches candidate, increment
            else if (num == candidate) {
                count++;
            } 
            // If it is a mismatch, decrement
            else {
                count--;
            }
        }

        return candidate;
    }
}
