//pb:75
//date:3.12.25
//Intuition
Main intuition in this problem is that sorting the numbers accordingly without using actual Arrays.sort(nums) or any sorting techniques by directly importing.
Brute force=we can swap the adjacent numbers and rearrage the order.

Approach
Optimal approach:Count sort
Get the count of the number of 0,1,2
And overwrite the original array until the count>0 so that each and every values will be placed properly starting from 0 to 2
The 3 while loops run until the respective count becomes 0

Complexity
Time complexity:
Tc=O(n)
for loop-O(n)
3 while loop until count becomes 0=O(n)
OVERALL TC:
O(n)+O(n)=O(2n)=O(n)

Space complexity:
//O(1)=space complexity only counter variables are used

Code
class Solution {
    public void sortColors(int[] nums) {
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count0++;
            }
            else if(nums[i]==1){
                count1++;
            }
            else if(nums[i]==2){
                count2++;
            }
        }
        int i=0;
      while(count0>0){
        nums[i]=0;
        i++;
        count0--;
      }
      while(count1>0){
        nums[i]=1;
        i++;
        count1--;
      }
      while(count2>0){
        nums[i]=2;
        i++;
        count2--;
      }



    }
}
