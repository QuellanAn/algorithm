package leetcode.day14;

/**
 * @ClassName Solution
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/4/27 8:23
 * @Version 1.0
 */
public class Solution {

    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int mid=(start+end)/2;
        while(start<=end){
            mid=(start+end)/2;
            if(target==nums[mid]){
                return mid;
            }

            if(nums[start]<=nums[mid]){
                if ( target<= nums[mid]  && target>=nums[start]) {
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target>=nums[mid] && target<=nums[end]){
                    start=mid+1;
                }else{
                    end =mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution= new Solution();
        int nums[]= {4,5,6,7,0,1,2,3};
        System.out.println(solution.search(nums,0));
    }
}
