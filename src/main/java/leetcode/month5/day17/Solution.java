package leetcode.month5.day17;

public class Solution {

    public int maxProduct(int[] nums) {

        int length=nums.length;
        if(length<1){
            return 0;
        }

        int[][] dp=new int[length][2];
        dp[0][0]=nums[0];
        dp[0][1]=nums[0];
        for(int i=1;i<length;i++){
            if(nums[i]>0){
                dp[i][0]=Math.min(nums[i],nums[i]*dp[i-1][0]);
                dp[i][1]=Math.max(nums[i],nums[i]*dp[i-1][1]);
            }else {
                dp[i][0]=Math.min(nums[i],nums[i]*dp[i-1][1]);
                dp[i][1]=Math.max(nums[i],nums[i]*dp[i-1][0]);
            }
        }
        int max=dp[0][1];
        for(int i=0;i<length;i++){
            if(dp[i][1]>max){
                max=dp[i][1];
            }
        }
        return max;
    }





}
