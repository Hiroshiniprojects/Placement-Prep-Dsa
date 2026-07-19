class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        Arrays.fill(arr,-1);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=i+n-1;j++){
                int indx=j%n;
                if(nums[indx]>nums[i]){
                    arr[i]=nums[indx];
                    break;
                }
            }
        }
        return arr;
    }
}