class Solution {
   
    public boolean isPalindrome(int x) {
    String s= String.valueOf(x);//str conversion
    int n=s.length();//checking the length so that if len missmatch we can not compare the 2 strings for palindrome
    for(int i=0;i<n/2;i++){
        if(s.charAt(i)!=s.charAt(n-i-1))return false;
    }
   return true;
    }
}