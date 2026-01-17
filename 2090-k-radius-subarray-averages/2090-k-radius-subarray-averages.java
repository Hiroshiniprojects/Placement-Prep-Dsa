class Solution {
    public int[] getAverages(int[] nums, int k) {
        int len=nums.length;
        int[] ans=new int[len];
        Arrays.fill(ans,-1);
        int windowsize=2*k+1;
        if(len<windowsize) return ans;
        long sum=0;
        for(int i=0;i<windowsize;i++){
            sum+=nums[i];
        }
        ans[k]=(int)(sum/windowsize);
        int l=0;
        int r=windowsize;
        while(r<len){
            sum=sum-nums[l]+nums[r];
            l++;
            ans[l+k]=(int)(sum/windowsize);
            r++;
        }
return ans;
        }
    }
