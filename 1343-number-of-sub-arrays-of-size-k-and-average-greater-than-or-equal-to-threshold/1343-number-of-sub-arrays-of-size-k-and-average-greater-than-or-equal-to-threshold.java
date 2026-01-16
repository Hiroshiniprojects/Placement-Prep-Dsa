class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        int count=0;
        float avg=0;
        int n=arr.length;
        for(int i=0;i<k;i++){
            sum+=arr[i];
            
        }
        avg=sum/k;
        if(avg>=threshold){
            count++;
        }
        int l=0;
        int r=k-1;
        while(r<n-1){
            sum=sum-arr[l];
            l++;
            r=r+1;
            sum=sum+arr[r];
            avg=sum/k;
            if(avg>=threshold){
                count++;
            }
            
        }
        return count;
    }
}