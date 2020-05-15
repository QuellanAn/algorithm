package leetcode.month5.day14;

public class Solution {

    public int subarraySum(int[] nums, int k) {

        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k){
                    count++;
                }
            }


        }
        return count;
    }


    public static void main(String[] args) {
        Solution solution=new Solution();
        int [] nums={28,54,7,-70,22,65,-6};
        System.out.println(solution.subarraySum(nums,100));
    }
}
