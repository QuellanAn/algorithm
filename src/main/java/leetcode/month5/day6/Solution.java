package leetcode.month5.day6;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Solution
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/5/6 8:39
 * @Version 1.0
 */
public class Solution {


    int [] consts;
    Integer[]  alldays;
    Set<Integer> set;

    public int mincostTickets(int[] days, int[] costs) {
        this.consts=costs;
        alldays=new Integer[366];
        set=new HashSet<>();
        for(int day:days){
            set.add(day);
        }
        return dp(1);
    }

    public int dp(int i){
        if(i>365){
            return 0;
        }
        if(alldays[i] !=null){
            return alldays[i];
        }

        if(set.contains(i)){
            alldays[i]=Math.min(Math.min(dp(i+1)+consts[0],dp(i+7)+consts[1]),dp(i+30)+consts[2]);
        }else{
            alldays[i]=dp(i+1);
        }
        return alldays[i];
    }

}
