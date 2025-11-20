class Solution {
    public int reversing(int x){
        int rev=0;
        int reverse=0;
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