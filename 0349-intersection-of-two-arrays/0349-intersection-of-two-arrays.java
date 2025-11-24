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