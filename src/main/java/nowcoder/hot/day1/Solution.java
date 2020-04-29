package nowcoder.hot.day1;

import java.util.Arrays;

/**
 * @ClassName Solution
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/4/28 16:27
 * @Version 1.0
 */
public class Solution {


    /**
     * 计算有多少对符合条件的数对
     * @param a int整型一维数组 数组a
     * @param b int整型一维数组 数组b
     * @return int整型
     */
    public int countLR (int[] a, int[] b) {
        // write code here
        int count=0;
        for(int i=0;i<b.length;i++){
            int sum=0;
            for(int j=i;j<b.length;j++){
                sum+=a[j];
                if(sum==b[i]+b[j]){
                    count++;
                }
            }
        }
        return count;
    }




}
