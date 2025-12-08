class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int maxlen=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                int currlen=1;
                while(set.contains(num+1)){
                    currlen++;
                    num++;
                }
                maxlen=Math.max(maxlen,currlen);
            }

        }
        return maxlen;
    }
}