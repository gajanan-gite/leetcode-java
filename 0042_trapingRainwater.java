// class Solution {
//     public int trap(int[] height) {

//         int[] leftmax=new int[height.length];
//         leftmax[0]=Integer.MIN_VALUE;
//         for(int i=1;i<height.length;i++){
//             leftmax[i]=Math.max(leftmax[i-1],height[i-1]);
//         }
        
//         int[] rightmax=new int[height.length];
//         rightmax[height.length-1]=Integer.MIN_VALUE;
//         for(int i=height.length-2;i>=0;i--){
//             rightmax[i]=Math.max(rightmax[i+1],height[i+1]);
//         }
        
//         int watertrap=0;
//         for (int i=0;i<height.length;i++){
//         if(Math.min(leftmax[i],rightmax[i])>height[i]){
//            watertrap += Math.min(leftmax[i],rightmax[i])-height[i];
//         }
//         }

//     return watertrap;    
//     }
// }

class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int waterTrap = 0;

        while (left < right) {
            if (height[left] <= height[right]) {
                // left side is the limiting side
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    waterTrap += leftMax - height[left];
                }
                left++;
            } else {
                // right side is the limiting side
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    waterTrap += rightMax - height[right];
                }
                right--;
            }
        }

        return waterTrap;
    }
}
