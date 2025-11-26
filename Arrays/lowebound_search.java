//pb:25(easy)
//date:26.11.25
class Solution {
    public int searchInsert(int[] nums, int target) {
        //LOWER BOUND PROBLEM:BINARY SEARCH--->(HAVE LOW,MID,HIGH,ANS AND WHILE LOOP)
        //ALWAYS MID=LOW+HIGH/2(IN INDEX NO VALUES)
        
        //here this is a binary search approach
        //things to follow:
        //low always first index not the value and high last index\
        //while looping till the condition low<=high if low>high the condition terminates
        //then always the mid changes accordingly 
        //key logic arr[mid]>=target and having an ans variable that stores the index correctly
         //if it is greater then it may be the answer or may not be the answer to further cheecking is neccessary until the loop is terminated 
         //move the high before mid-1 and again continue the loop from  the new high(low--->mid---->high).then return the ans which is the correct index
         //if arr[mid]<=target do not change the ans since it can not be the lowerbound
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return ans;
        
    }
}
