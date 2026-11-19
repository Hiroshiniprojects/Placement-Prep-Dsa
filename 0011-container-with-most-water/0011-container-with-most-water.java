class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxval=0;
        while(left<right){
            int h=Math.min(height[left],height[right]);
            int b=right-left;
            int area=h*b;
            maxval=Math.max(area,maxval);
            if(height[left]<=height[right]){
                left++;
            }
            else{
                right--;
            }   

        }
        return maxval;
    }
}