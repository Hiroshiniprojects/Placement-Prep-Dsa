//pb:169
//easy-optimal approach
//O(n)
//NO EXTRA SPACE
//have 2 variables here count and element count is just an indicator in iterator process it is not involved in giving original count
//if count=0 make the count is =1 and start the process from that element .that element is stored in the variable
//the 2 if conditions separate separate increment and decrement process for array if the count turns out to be 0 we get the element as num[i]
//if there exist any element just return the element
//or a for loop with actual counter c that counts the occurs of that particular element is that is greater than n/2 the element is returned

//THIS APPROACH IS CALLED MOORES VOTING ALGORITHM APPROACH.
//TO REM:count indicator,element,single for loop
class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int element=nums[0];
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                count=1;
                element=nums[i];
            }
            else if(nums[i]==element){
                count++;
            }
            else{
                count--;
            }
        }
       // int c=0;
        //for(int i=0;i<nums.length;i++){
            //if(nums[i]==element){
             //   c++;
           // }

       //  }
        // if(c>(nums.length)/2){
         //   result=element;
        // }

        
        return element;
    }
}
