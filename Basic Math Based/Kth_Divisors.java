//1492. The kth Factor of n
//23.11.25
//You are given two positive integers n and k. A factor of an integer n is defined as an integer i where n % i == 0.(finding the number of divisors logic:n%i and getting one factor as i and another as n/i
//i and n/i will give the complete factors
//if condition befor (n/i!=i)=does not allow repeated factors
//pesudo logic:

eg:36
sqrt(36)=6
n will range frome  1,2,3,4,5,6 and n/i wil start from 36/1,36/2....36/6(core logic)

//Consider a list of all factors of n sorted in ascending order, return the kth factor in this list or return -1 if n has less than k factors.

Example 1:
Input: n = 12, k = 3
Output: 3
Explanation: Factors list is [1, 2, 3, 4, 6, 12], the 3rd factor is 3.
Example 2:

Input: n = 7, k = 2
Output: 7
Explanation: Factors list is [1, 7], the 2nd factor is 7.
Example 3:

Input: n = 4, k = 4
Output: -1
Explanation: Factors list is [1, 2, 4], there is only 3 factors. We should return -1.
//

import java.util.ArrayList;
import java.util.List;
class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> list=new ArrayList<>();
        int m= (int)Math.sqrt(n);
        for(int i=1;i<=m;i++){
            if(n%i==0){
                list.add(i);
                if(n/i!=i){
                list.add(n/i);
                }
            }
            
        }
        list.sort(null);
        int value=0;
        int len=list.size();
        if(k<=len){
            value=list.get(k-1);
        }
        else{
            return -1;
        }

return value;
    }
}
