//pb:09
//19.11.25
//leetcode:easy
//MY brute force approach initial intiution:using 2 functions one int func returning int value and boolean func returning true or false for palindrome
//am using a reverse initialiser=0 and unitdigit exactracting for edge case maintaince in pb if sample ip=10 op=01 not palindrome to this logic getting unit digit
//as usual one while loop,remainder,digit extraction,reversing logic:rev*10.if num>0 checking palindrome 
//if number<0=not plaindrome:sample ip:-121!=121 logic
//then returning the rev to boolean func and checking wiht original num for palindrome

class Solution {
    public int reversing(int x){
        int rev=0;
        int unitdigit=x%10;
        while(x!=0){
            if(x>0){
                int rem=x%10;
                if(unitdigit!=0){
                rev=rev*10+rem;
                x=x/10;
                }
                else{
                    return 0;
                }
            }
            else{
                return 0;
               
            }
        }
        return rev;
    }

    public boolean isPalindrome(int x) {
        int reversalvalue=reversing(x);
        if(reversalvalue==x){
            return true;
        }
        else{
            return false;
        }
    }
}
//Logic 2 intution:
//converting int to str and checking the symmetricity
//here String.valueOf is used to convert int to str in java
//and a for loop running till mid element since mid element will not have symmericity 
//example check:first element is checked with last index element if they are same loop runs and moves till mid
//no negative logic:coz "-121"n=4 and "-" is compared with last inde val="1"
//"1"!="-"-so false
//edge case 2:10 and 01 is not plaindrome that is also solved
class Solution {
   
    public boolean isPalindrome(int x) {
    String s= String.valueOf(x);//str conversion
    int n=s.length();//checking the length so that if len missmatch we can   not compare the 2 strings for palindrome
    for(int i=0;i<n/2;i++){
        if(s.charAt(i)!=s.charAt(n-i-1))return false;
    }
   return true;
    }
}
//not better optimal compared to mathmatical reverse







