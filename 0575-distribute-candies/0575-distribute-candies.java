import java.util.*;
class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> count=new HashSet<>();
        int size=candyType.length;
        for(int i=0;i<size;i++){
            count.add(candyType[i]);
        }
        if(size/2<=count.size()){
            return size/2;
        }

     return count.size();
    }
}