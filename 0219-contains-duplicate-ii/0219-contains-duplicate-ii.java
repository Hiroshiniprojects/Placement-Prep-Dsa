import java.util.*;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int val=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                val=i-map.get(nums[i]);
                 if(val<=k){
                     return true;
                 }     
            }
           map.put(nums[i],i); 
        }
        return false;
    }
}