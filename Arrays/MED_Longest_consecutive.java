//128. Longest Consecutive Sequence
//date:8.12.25
//LEETCODE-MED
//THE most optimal sol with O(n)-asked in qp(hash set) from arrays copying the elements to hash set:then for each to get the elements
//do not use a for loop it is returning the arr index not the values that is used in only arrays
//if hashset does not contain the previous element make the current length=1 and take a while loop tp loop through all the continous consecutive elements
//increaste the current len and num finally get the max btw currentlen and maxlen
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
