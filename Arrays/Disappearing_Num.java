//pb:121-leetcode easy
//Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
//best approach:take the abs of the index by nums[i]-1,check if the number or the value in thatt index is positive we mark that value by negative value*-1
// again take a for loop and check if the values >0 get the index+1 that is the disappeared number so add it into the list
// see the index-4,5 are unmarked and remains same as(8,2) so index+1=5 for i=4 and index+1=6 for i=5
//return the list


//brute force length of array=n so iterate using for loop
//if arr[i] contain the i values we move to the next index
//dual for loop but not efficient
//another method(sorting+gap)this is my approach but not optimal coz O(nlogn)-tc for time complexity
  
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;//abs is imp if not abs the value in the index will be neg so the conditions will fail be careful in this condition
            if(nums[index]>0){
                nums[index]=nums[index]*-1;
            }
        }
        
    for(int j=0;j<nums.length;j++){
        if(nums[j]>0){
            int indx=j+1;
            list.add(indx);
        }
    }
        return list;        
    }
}
