class Solution {
    public int thirdMax(int[] nums) {
        long l=Long.MIN_VALUE;
        long sL=Long.MIN_VALUE;
        long tL=Long.MIN_VALUE;

        for (int i=0;i<nums.length;i++){
            if(nums[i]>l){
                tL=sL;
                sL=l;
                l=nums[i];
            }
            else if(nums[i]<l && nums[i]>sL){
                tL=sL;
                sL=nums[i];
            }
            else if(nums[i]<sL && nums[i]>tL){
                tL=nums[i];
            }
        
        }
        return tL!=Long.MIN_VALUE?(int)tL:(int)l;
    }
}

// or with for each loop

class Solution {
    public int thirdMax(int[] nums) {
        long l = Long.MIN_VALUE;
        long sL = Long.MIN_VALUE;
        long tL = Long.MIN_VALUE;

        for (int num : nums) {
            if (num == l || num == sL || num == tL) continue; // skip duplicates explicitly

            if (num > l) {
                tL = sL;
                sL = l;
                l = num;
            } else if (num > sL) {
                tL = sL;
                sL = num;
            } else if (num > tL) {
                tL = num;
            }
        }

        return tL != Long.MIN_VALUE ? (int) tL : (int) l;
    }
}
