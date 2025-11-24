//pb:283,easy
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.
//Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
//mistake1:Here what mistake i made is initalizing the size after declaring a array coz be to get size as 0 so for the 3rd for loop the values are overwritten and got all values as zeros
//mistake2:list.add(i)-we should store the value instead of index-list.add(nums[i])
//Brute force:
//Inplace moving zeros to end first having a extra list as an temp space then fidning the nonzeros and then storing the non zero values to the original array nums
//then getting the size of the list then from the remaining indices from the original array we add nums[i] as 0
// TC:O(n)+O(x)-for no of non zeros+O(x-n)-NO OF ZEROS
code:
import java.util.ArrayList;
class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                list.add(nums[i]);
            }
        }
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        int size=list.size();

        for(int i=size;i<nums.length;i++){
            nums[i]=0;
        }


    }
}
