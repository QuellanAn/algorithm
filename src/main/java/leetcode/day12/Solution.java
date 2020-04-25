package leetcode.day12;

import java.util.ArrayList;
import java.util.List;

public class Solution {


    /**
     * 46. 全排列
     * @param nums
     * @return
     */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list= new ArrayList<>();

        int length=nums.length;
        if(length<1){
            return list;
        }
        List<Integer> temp=new ArrayList<>();
        boolean[] isused=new boolean[length];

        dfs(nums,length,0,isused,temp,list);

        return  list;
    }
    public void dfs(int[] nums,int length,int index,boolean[] isused,List<Integer> temp,List<List<Integer>> list){

        if(index==length){
            list.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i=0;i<length;i++){
            if(!isused[i]){
                temp.add(nums[i]);
                isused[i]=true;
                dfs(nums,length,index+1,isused,temp,list);
                isused[i]=false;
                temp.remove(temp.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.permute(nums);
        System.out.println(lists);
    }
}
