package leetcode.day11;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Solution
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/4/24 10:19
 * @Version 1.0
 */
public class Solution {

    private int count;
    public int reversePairs(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int[] temp=new int[nums.length];
        sort(nums,left,right,temp);
        return count;
    }
    public void sort(int[] nums,int left,int right,int[] temp){
        if(left<right){
            int mid=(left+right)/2;
            sort(nums,left,mid,temp);
            sort(nums,mid+1,right,temp);
            merge(nums,left,mid,right,temp);
        }
    }
    public void merge(int[] nums,int left,int mid,int right,int[] temps){
        int i=left;
        int j=mid+1;
        int t=0;
        while(i<=mid && j<=right){
            if(nums[i]<=nums[j]){
                temps[t++]=nums[i++];
                count+=j-mid-1;
            }else{
                temps[t++]=nums[j++];
            }
        }
        while(i<=mid){
            temps[t++]=nums[i++];
            count+=j-mid-1;
        }
        while(j<=right){
            temps[t++]=nums[j++];
        }

        t=0;
        while(left<=right){
            nums[left++]=temps[t++];
        }

    }


    public static void main(String[] args) {
        Solution solution= new Solution();
        int[] nums={1,3,2,3,1};
        System.out.println(solution.reversePairs(nums));

        Map<String,Integer> map=new HashMap<>();
    }


}
