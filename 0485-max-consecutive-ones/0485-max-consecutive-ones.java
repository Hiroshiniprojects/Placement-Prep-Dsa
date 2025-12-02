class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int size=nums.length;
        int count=0;
        int maxcount=0;
        for(int i=0;i<size;i++){
            if(nums[i]==1){
                count++;
                if(count>maxcount){
                maxcount=count;
                }
            }
                
            else{
                count=0;
            }

        }
        return maxcount;
    }

}