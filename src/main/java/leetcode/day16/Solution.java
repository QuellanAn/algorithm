package leetcode.day16;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Solution
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/4/28 8:18
 * @Version 1.0
 */
public class Solution {


    /**
     * 面试题56 - I. 数组中数字出现的次数
     * @param nums
     * @return
     */
    public int[] singleNumbers(int[] nums) {

        int num=0;
        for(int i=0;i<nums.length;i++){
            num=num^nums[i];
        }
        int b=num & (-num);
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            if((nums[i] & b)==0){
                arr[0]=arr[0]^nums[i];
            }else{
                arr[1]=arr[1]^nums[i];
            }
        }
        return arr;
    }

    public static void main(String args[]) {
        int i = 0;
         i=++i + i;
        System.out.println("I =" +i);
    }

}
