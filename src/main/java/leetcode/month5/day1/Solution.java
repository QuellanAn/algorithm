package leetcode.month5.day1;

import java.util.HashMap;

public class Solution {



    public int lengthOfLongestSubstring(String s) {

        int count=0;
        int i=0;
        int j=i;
        HashMap<Character,Integer> map=new HashMap<>();
        while(j<s.length()){
            char c=s.charAt(j);
            if(map.containsKey(c)){
                i=Math.max(i,map.get(c));
            }
            count=Math.max(count,j-i+1);
            map.put(c,j+1);
            j++;


        }
        return count;
    }
}
