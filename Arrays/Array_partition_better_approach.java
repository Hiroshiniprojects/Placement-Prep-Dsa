//pb:561
//date:1.12.25
//this problems tells us to find the mininum value from the pairs of elements from 2n of array size and return the max value of the sum of min values
//brute force is not possible coz it gives us different combinations
//better approach:sorting+taking the even elements ith positions coz that will be the min value when we pair up the elements
//so this is the better aproach but the tc:O(nlogn)-not best solution

import java.util.Arrays;
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                sum+=nums[i];
            }
        }
        return sum;
    }
}
