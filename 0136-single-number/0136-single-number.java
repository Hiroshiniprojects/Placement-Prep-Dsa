class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int val=0;
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j] && i!=j){
                    count++;
                }
            }
            if(count==1){
                val=nums[i];
            }

        }
        return val;
    }
}