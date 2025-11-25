class Solution {
    public int smallestRepunitDivByK(int k) {
        //repunit next=prev*10+1 logic
        //can not store full num so next%k=(prev*10+1)%k
        //1
        //11
        //111
        //1111
        //repunit building 11-->1*10+1(logic)
        //we will never store the entire num(only remainders trick)
        //loop till k coz only possible k remainders iterations
        if(k%2==0|| k%5==0)return -1;
        int rem=0;
        int count=0;
        for(int i=1;i<=k;i++){//no of iterations give the number of len according to remainder
        rem=(rem*10+1)%k;
        count++;
        if(rem==0){
        return count;
        }
        }

  return -1;
    }
}
