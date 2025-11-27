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