import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
       char[] a=s.toCharArray();
       char[] b=t.toCharArray();
       Arrays.sort(a);
       Arrays.sort(b);

       boolean n = Arrays.equals(a,b);
       return n;
}}