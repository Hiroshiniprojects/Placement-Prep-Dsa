//pb:349 leetcode easy
//brute force approach used list,hashset and visited array 
//Major issue:used flag variable every time the issue was multiple duplicate values in different indexs like[2,2] but the output should be[2]
//so used hashset and func contains is used and if vis==0 valid
//then transferring to list coz i was unable to initialize the size for the array as it is dynamic i used list this was my approach
//then copying the list to arr
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int []vis=new int[m];
        List<Integer> list=new ArrayList<>();
        Set<Integer>used=new HashSet<>();
        for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
          if(nums1[i]==nums2[j] && vis[j]==0 ){
            if(!used.contains(nums1[i])){
                list.add(nums1[i]);
                used.add(nums1[i]);
            }
               vis[j]=1;
                break;
          }
        }
        }
        int size=list.size();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}
