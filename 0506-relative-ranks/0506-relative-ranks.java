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