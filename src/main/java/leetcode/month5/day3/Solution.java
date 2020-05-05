package leetcode.month5.day3;

public class Solution {


    public int jump(int[] nums) {

        int target=nums.length-1;
        int count=0;

        while(target>0){
            for(int i=0;i<target;i++){
                if(i+nums[i]>=target){
                    target=i;
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}
