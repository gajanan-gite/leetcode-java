class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum=0;
        for(int val:nums){
            totalSum+=val;
        }
        for(int i=0;i<nums.length;i++){

            int leftSum=0;
            for(int j=0;j<i;j++){
                leftSum+=nums[j];
            }
            int rightSum=totalSum-leftSum-nums[i];

            if(leftSum==rightSum) return i;
        }
    return -1;
    }
}
