package leetcode.month5.day19;

import java.util.Arrays;

public class Solution {



    public int findTheLongestSubstring(String s) {

        int length=s.length();
        int[] pos=new int[1<<5];
        Arrays.fill(pos,-1);
        int ans=0;
        int status=0;
        pos[0]=0;
        for(int i=0;i<length;i++){
            char c=s.charAt(i);
            if(c=='a'){
                status=status^ (1<<0);
            }else if(c=='e'){
                status=status^ (1<<1);
            }else if(c=='i'){
                status=status^ (1<<2);
            }else if(c=='o'){
                status=status^ (1<<3);
            }else if(c=='u'){
                status=status^ (1<<4);
            }

            if(pos[status]>=0){
                ans=Math.max(ans,i+1-pos[status]);
            }else {
                pos[status]=i+1;
            }
        }

        return ans;


    }
}
