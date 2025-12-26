class Solution {
    public int maxVowels(String s, int k) {
    int value;
    int sum=0;
    int max=0;
    for(int i=0;i<k;i++) {
        char ch=s.charAt(i);
        if(ch=='a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            value=1;
        }
        else{
        value=0;
        }
        sum+=value;
        
    }
    max=sum;
    for(int i=k;i<s.length();i++){
        char prev=s.charAt(i-k);
        char in=s.charAt(i);
        sum-=(prev=='a'||prev=='e'||prev=='i'||prev=='o'||prev=='u')?1:0;
        sum+=(in=='a'||in=='e'||in=='i'||in=='o'||in=='u')?1:0;
        max=Math.max(sum,max);
    }
    return max;
    }
}