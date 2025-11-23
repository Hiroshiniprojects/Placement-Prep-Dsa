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