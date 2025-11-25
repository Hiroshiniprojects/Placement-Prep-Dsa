//pb:27
//leetcode:easy
//approch 2 pointer -optimal:
//used i and j pointers i will move only if it finds different val other then k else i stays and j is normal iterator
//[3 2 2 3] k=3 so i and j =0 i=0=3 and k=3 so i stays j moves j=2 and not eqaul to k so num[i]=3 is repalced as 2:[2 2 2 3] now i is moves i=1
j is moved hence 2 is the new value i =2 [2 2 2 3] and j is moved then i is retruned as index

class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int count=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
      
        }
        return i;
    
    }
}
