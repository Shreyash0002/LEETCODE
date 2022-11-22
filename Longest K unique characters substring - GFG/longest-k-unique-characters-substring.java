//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    public int longestkSubstr(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0,j=0,ans=-1;
        while (j < s.length()) {
            if (map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j),(map.get(s.charAt(j))+1));
            } else {
                map.put(s.charAt(j),1);
            }
            if (map.size() < k) {
                j++;
            } else if (map.size()==k) {
                if (ans < (j - i + 1)) {
                    ans=j-i+1;
                }
                j++;
            } else {
                while (map.size() > k) {
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