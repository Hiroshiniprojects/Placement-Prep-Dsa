//PB NO:07
//Difficulty-med
//20.11.25
//Topic-basic math
//To rem:Take different variables to use for negative and non negative value reversing
//Approach:Brute force:2 while loop approach no decrement of number by num-- exactracting digits %10 and reverse concept is used:reverse=reverse*10
//normal numbers:input-123,op=321
//negative number=-123,op=-321
//Negative number if check,take the abs or num*-1 will give positive value and proceed normal reverse
//Edge cases in qp:
//32 bit os so it should exceed the general maxvalue and minvalue of sys
//so in reverse using a if condition to check if rev>Integer.MAXVALUE/10-why /10 coz only numbers before the last decimal is allowed 214348

//KEY LOGIC TO REM FROM THIS QP:

//X * 10 ≤ 2147483647   (MAX)
//so while reversing this turns into 7463847412 which is larger in 32 bit sys so in the prioer step we are checking the condition 
//X ≤ 2147483647 / 10
//X ≤ 214748364.7 So the maximum safe number before multiplication by 10 is:214748364
//That value is exactly:Integer.MAX_VALUE / 10



//Intitution:
//1.Initialize the reversed number (rev) to 0.
//2.Loop through each digit of the input number.
//For each digit, check if adding it to the reversed number will cause an overflow.
//3.If an overflow is detected, return 0.
//Otherwise, update the reversed number by multiplying it by 10 and adding the current digit.
//4.Continue this process until all digits are processed.
//5.Return the reversed number with the appropriate sign.

class Solution {
    public int reverse(int x) {
        int temp=x;
        int rev=0;
        int r=0;
        if(temp<0){
        int n=Math.abs(temp);
        while(n>0){
            int ldigit=n%10;
            if(r>Integer.MAX_VALUE/10)return 0;
            r=r*10+ldigit;
            n=n/10;

        }
       return r*-1;
        }
        else{
            while(temp>0){
            int lastdigit=temp%10;
            if(rev>Integer.MAX_VALUE/10)return 0;
            rev=rev*10+lastdigit;
            temp=temp/10;
        }
            
        }
        return rev;
    }
}
