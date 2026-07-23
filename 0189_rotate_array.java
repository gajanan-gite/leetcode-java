// class Solution {
//     public void rotate(int[] nums, int k) {
//      int n =   nums.length -1;
    
//       nums.reverse(0,n);
//       nums.reverse(0,k);
//       nums.reverse(k+1,n);
        
//     }
// }

class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length; 
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    
    // Helper method to reverse a subarray in-place
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
