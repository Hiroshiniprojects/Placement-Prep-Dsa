import java.util.*;
class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int ref=-1;
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            if(ref==-1){
            ref=entry.getValue();
            }
            else{
                if(entry.getValue()!=ref){
                    return false;
                }
            }
        }
        return true;
    }
}