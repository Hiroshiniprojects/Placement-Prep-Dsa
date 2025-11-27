//pb:169
//easy,date:27.11.25
//pb:to return the number that is greater than n/2=size of the arr/2 
//brute force:normal count and dual forloop if count>n/2 then we return the count but O(n^2)-not optimal
//so better approach is HashMap
//used for counting and tracking the values in the map initializing the hashmap in java then if the map contains the key we get the value from the key and add+1
//else put the key and value as 1
//if val >result getting the most highest possible greater value than n/2 if value>size which is n/2 we return that
//O(nlogn)+O(n)-worst case loop 1 iterators n*logn times coz of collision and become a tree.
//overall O(N)
import java.util.HashMap;
import java.util.Map;
class Solution {
    public int majorityElement(int[] nums) {
        int size=(nums.length)/2;
        int result=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
           map.put(nums[i],1);
            }
        }

        int finalkey=0;
     for(Map.Entry<Integer,Integer>entry:map.entrySet()){
        Integer key=entry.getKey();
        Integer val=entry.getValue();
        if(val>result){
                result=val;
        }
        if(val>size){
            finalkey=key;
        }

     }

        return finalkey;
    }
}
