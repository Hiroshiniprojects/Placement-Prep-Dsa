//pb:506
//You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition. All the scores are guaranteed to be unique.

The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:

The 1st place athlete's rank is "Gold Medal".
The 2nd place athlete's rank is "Silver Medal".
The 3rd place athlete's rank is "Bronze Medal".
For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
Return an array answer of size n where answer[i] is the rank of the ith athlete.

 

Example 1:

Input: score = [5,4,3,2,1]
Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].
Example 2:

Input: score = [10,3,8,9,4]
Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
Explanation: The placements are [1st, 5th, 3rd, 2nd, 4th].

//
//approach:priority queue used here as it stores the indexs and the comparator is used to maintain the max heap priority instead of min heap priority
//like (10-idx=0,3-idx=1,8=idx=2,9=idx=9,4=idx=4)- so from this we are mapping using comparator if b-a b stays else a is kept in the order
//and while loop we give the places and the postitions by normal count in the new answer array in the same order

import java.util.*;
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int len=score.length;
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)-> score[b]-score[a]);
        for(int i=0;i<len;i++) pq.offer(i);
        int place=1;
        String[]answer=new String[len];
        while(!pq.isEmpty()){
            int idx=pq.poll();
            if(place==1)answer[idx]="Gold Medal";
            else if(place==2)answer[idx]="Silver Medal";
            else if(place==3)answer[idx]="Bronze Medal";
            else answer[idx]=String.valueOf(place);
            place++;
        }
        return answer;
        
    }
}
