class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0,ans=0,zerocount=0,n=nums.length;
        while(j<n)
        {
            if(nums[j]==0)
            {    
                zerocount+=1;
            }
            if(zerocount<=k)
            {    if(ans<j-i+1)
                    ans=j-i+1;
            j++;
            }   
            if(zerocount>k)
            {
                while(zerocount>k)
                {
                    if(nums[i]==0)
                        zerocount-=1;
                    i++;
                   
                }
                 j++;
            }
        }
    return ans;
    }
}