//pb:217
//date:26.11.25
//The most optimal sol:using hashset O(n)
//dual for loop exceed the time limit for larger ip size 10^5 constraint but no extra space inefficient
//sorting another approach O(nlogn)- greater than o(n) and it is also not suitable for larger constraints
//so the hash set is the approach where we declare a set and that set contains only unique elements
class Solution {
    public boolean containsDuplicate(int[] nums) {
      Set<Integer> set= new HashSet<>();
      for(int i=0;i<nums.length;i++){
        if(set.contains(nums[i])){
            return true;
        }
        else{
            set.add(nums[i]);
        }
      }
      return false;
    }
}
