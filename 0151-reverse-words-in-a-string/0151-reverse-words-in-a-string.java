import java.util.*;
class Solution {
    public String reverseWords(String s) {

        String p=s.trim();
        StringTokenizer n=new StringTokenizer(p);
        String str = "";
while(n.hasMoreTokens())
str = n.nextToken() + " " + str;
        str=str.trim();
        return str;
    }
}