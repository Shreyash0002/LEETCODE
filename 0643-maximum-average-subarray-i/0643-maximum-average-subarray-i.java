class Solution {
    public double findMaxAverage(int[] nums, int k) {
         double ans = Double.NEGATIVE_INFINITY;
        double sum=0;
        int i=0,j=0;
        while(j<nums.length)
        {
            sum+=nums[j];
        if(j-i+1<k)
        j+=1;
        else if(j-i+1==k)
        {
            ans=ans>sum?ans:sum;
        sum-=nums[i];
        j++;
        i++;
        }
        }
        return ans/k;
    }
}