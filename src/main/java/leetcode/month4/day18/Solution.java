package leetcode.month4.day18;

import java.util.HashSet;
import java.util.Set;
/**
 * @ClassName Solution
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/4/30 8:20
 * @Version 1.0
 */
public class Solution {


    public boolean isHappy(int n) {

        Set<Integer> set =new HashSet<>();
        int sum=0;
        while(sum!=1){
            while(n!=0){
                sum+=(n%10)*(n%10);
                n=n/10;
            }
            if(sum==1){
                break;
            }else if(set.contains(sum)){
                return false;
            }else{
                set.add(sum);
                n=sum;
                sum=0;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution =new Solution();
        System.out.println(
                solution.isHappy(19)        );
    }
}
