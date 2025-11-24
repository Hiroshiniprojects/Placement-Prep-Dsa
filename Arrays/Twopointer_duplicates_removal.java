//PB:EASY
//Date:24.11.25
//PB:
//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
//Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing duplicates, return the number of unique elements k.
//The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.
//sample ip:
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
  
//optimal approach:
//2 pointer approachhaving i as the initial pointer and j as moving pointer if i and j are both different then we can add the j value in i+1th position that is front of i
//and move the i pointer++ as the j continues this is inplace removing duplicates and the index+1 is returned as the sorted index.
code:
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        int index=i+1;
        return index;
    }
}
