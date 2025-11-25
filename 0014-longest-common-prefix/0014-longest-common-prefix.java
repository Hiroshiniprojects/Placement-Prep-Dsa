import java.util.Arrays;
class Solution {
    public String longestCommonPrefix(String[] strs) {
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