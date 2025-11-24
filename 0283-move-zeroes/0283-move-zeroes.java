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