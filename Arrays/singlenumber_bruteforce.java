//pb:136
//26.11.25-this is not the optimal approach
class Solution {
    public int singleNumber(int[] nums) {
        //optimal appraoch is xor here but still for practice i am using count and dual for loop and frequency finding approach
        //here am using a count variable every new element is counted as 1
        // if 2 elements are found and i!=j we get count++
        //after j completes we check one if any value has 1 count we return that
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
