class Solution {
    public int minimumRecolors(String blocks, int k) {
       int ans =k;
        int sum=0;
        int i=0,j=0;
        while(j<blocks.length())
        {
            if(blocks.charAt(j)=='W'){
                sum++;
            }
        if(j-i+1<k)
        j+=1;
        else if(j-i+1==k)
        {
            ans=ans<sum?ans:sum;
        if(blocks.charAt(i)=='W'){
            sum--;
        }
        j++;
        i++;
        }
        }
        return ans;  
    }
}