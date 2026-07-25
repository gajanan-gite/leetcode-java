// class Solution {
//     public void moveZeroes(int[] nums) {
//         int start=0;
//         int end=start+1;
//         while(end<=nums.length-1){
//         if(nums[start]==0){
//             int temp=nums[start];
//             nums[start]=nums[end];
//             nums[end]=temp;
//             start++;
//             end++;
//         }
//         else{
//             start++;
//             end++;
//         }
//        }
        
//     }
// }

// problem is if two adjecent zero czme its problematic hence we cant use it

class Solution {
    public void moveZeroes(int[] nums) {
        int start = 0; // where the next non-zero should go

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[start];
                nums[start] = nums[i];
                nums[i] = temp;
                start++;
            }
            // if nums[i] == 0, start stays put — waiting for a non-zero to swap in
        }
    }
}
