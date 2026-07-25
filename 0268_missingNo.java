// class Solution {
//     public int missingNumber(int[] nums) {
//         Arrays.sort(nums);
//         int loss=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==loss){
//                 loss++;
//             }
//         }
//     return loss;
//     }
// }

//second one is good  not uses th soring complexity is less compared to first one

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for(int num : nums) {
            actualSum += num;
        }
        
        return expectedSum - actualSum;
    }
}
