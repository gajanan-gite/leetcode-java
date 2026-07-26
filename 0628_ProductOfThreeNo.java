import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        
        // Option 1: Product of the three largest numbers
        int p1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        
        // Option 2: Product of the two smallest (negative) numbers and the largest number
        int p2 = nums[0] * nums[1] * nums[n - 1];
        
        return Math.max(p1, p2);
    }
}
