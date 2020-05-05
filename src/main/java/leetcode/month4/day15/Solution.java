package leetcode.month4.day15;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Solution
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/4/27 12:24
 * @Version 1.0
 */
public class Solution {


    /**
     * 无重复字符的最长子串
     * 采用双指针，map 中记录每个元素出现的最后位置
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int left=0;
        int right=left;
        int count=0;
        while(right<s.length()){
            char c=s.charAt(right);
            if(map.containsKey(c)){
                left=Math.max(map.get(c),left);
            }
            count=Math.max(count,right-left+1);
            map.put(c,right+1);
            right++;
        }
        return count;
    }
}
