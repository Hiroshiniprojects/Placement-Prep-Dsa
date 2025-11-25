import java.util.Arrays;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        //approch-sorting and then taking first and last element and running a for loop 
        //comparing the length and taking the min length so that to avoid index bound if 
        //ex:"fl" and last element is "flower" themin size is 2
        //so loops till index 2 to avoid error
        //appending using charAt() and breaking immediately if no continous element is found
        //return the str
        //no 2 looping we should always comparing the same index of 2 strs
        //sort the array
        int len=strs.length;
        Arrays.sort(strs);
        String n=strs[0];
        String m=strs[len-1];
        int min=Math.min(n.length(),m.length());
        String w="";
            for(int j=0;j<min;j++){
                if(n.charAt(j)==m.charAt(j)){
                   w+=n.charAt(j);
                }
                else{
                    break;
                }

            }
      return w;
        
    }
}
