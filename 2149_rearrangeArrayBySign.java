class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result=new int[nums.length];

        int positive=0;
        int negative=1;

        for(int val:nums){
            if(val<0){
                result[negative]=val;
                negative+=2;
            }
            else{
             result[positive]=val;
                positive+=2;
            }
        }
    return result;    
    }
}
