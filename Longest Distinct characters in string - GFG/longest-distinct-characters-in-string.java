//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public int longestSubstrDistinctChars(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0,j=0,ans=1;
        while (j < s.length()) {
            if (map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j),(map.get(s.charAt(j))+1));
            } else {
                map.put(s.charAt(j),1);
            }
            
              if (map.size()==j-i+1) {
                if (ans < (j - i + 1)) {
                    ans=j-i+1;
                }
                j++;
            } else {
                while (map.size() < j-i+1) {
                    map.put(s.charAt(i),(map.get(s.charAt(i))-1));
                    if (map.get(s.charAt(i)) == 0) {
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }
        return ans;
    }
}