package leetcode.month5.day8;

/**
 * @ClassName Solution
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/5/8 8:31
 * @Version 1.0
 */
public class Solution {


    public int maximalSquare(char[][] matrix) {
        if(matrix.length<1){
            return 0;
        }
        int m=matrix.length;
        int n=matrix[0].length;
        int [][] dp=new int[m][n];

        int max=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]=='0'){
                    dp[i][j]=0;
                }else if(i-1<0 ||j-1<0){
                    dp[i][j]=1;
                }else{
                    dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i-1][j-1]),dp[i][j-1])+1;
                }
                if(dp[i][j]>max){
                    max=dp[i][j];
                }
            }
        }

        return max*max;


    }
}
