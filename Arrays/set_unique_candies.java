//pb:575
//distributed candies check the length and if the candies/2 is greater we return the size else the non repeating count is returned
//non repeating unique elements from a array-use of hashmap or hash set
//hash set for unique no duplicate no key only value based storing
//better approach compared to dual loop
//but not the best approach
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
//optimal code
import java.util.*;
class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> count=new HashSet<>();
        int size=candyType.length;
        for(int i=0;i<size;i++){
            count.add(candyType[i]);
            if (count.size() == size / 2) return size / 2;
        }
     return count.size();
    }
}
//the beats is higher in this code coz the early exit of the loop is the key here it numbers only until n/2 times
