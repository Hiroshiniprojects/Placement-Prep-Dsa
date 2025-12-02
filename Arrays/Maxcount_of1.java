//pb:485
//see this is the optimal approach
//one for loop if the value is 1 count it and update max else make the count as 0
//so that the continious count of 1 is counted
//no sliding window nothing normal single loop approach
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
