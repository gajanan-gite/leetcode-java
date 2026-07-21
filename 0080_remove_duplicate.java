// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int j=1;
//         for (int i=0;i<nums.length;i++){
//             if(nums[i]==nums[i+1] && nums[i]==nums[j+1]){
//                 int indexToRemove = i;
//             }
//         }
//         return nums[];
        
//     }
// }

class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length <= 2)
            return nums.length;

        int j = 2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[j - 2]) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}
