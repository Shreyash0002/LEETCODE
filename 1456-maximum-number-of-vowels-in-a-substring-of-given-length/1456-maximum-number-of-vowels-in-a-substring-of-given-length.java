class Solution {
    public int maxVowels(String s, int k) {
       int ans=0;
        int sum=0;
        int i=0,j=0;
        while(j<s.length())
        {
    char c=s.charAt(j);
            if(c=='a' || c=='e' ||c=='i' || c=='o' || c=='u')
            sum++;
        if(j-i+1<k)
        j+=1;
        else if(j-i+1==k)
        {
            ans=ans>sum?ans:sum;
            char d=s.charAt(i);
        if(d=='a' || d=='e' ||d=='i' || d=='o' || d=='u')
sum--;
            j++;
        i++;
        }
        }
        return ans;
    }
}