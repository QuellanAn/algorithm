package leetcode.day11;

import java.util.Arrays;

/**
 * @ClassName Sort
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/4/24 8:37
 * @Version 1.0
 */
public class Sort {


    /**
     * 归并算法
     * @param args
     */
    public static void main(String[] args) {
        int[] nums={1,4,3,2,6,7,9,8,5};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums){
        int[] temp=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        gbsort(nums,left,right,temp);
    }

    /**
     * 核心
     * @param nums 需要排序的数组
     * @param left 左指针
     * @param right 右指针
     * @param temp 临时数组
     */
    public static void gbsort(int nums[],int left,int right,int[] temp){
        if(left<right){
            int mid=(left+right)/2;
            gbsort(nums,left,mid,temp);//左递归
            gbsort(nums,mid+1,right,temp);//有递归
            merge(nums,left,mid,right,temp);//合并排序
        }
    }

    public static void  merge(int nums[],int left,int mid,int right,int[] temp){
        int i=left;
        int j=mid+1;
        int t=0;
        while(i<=mid && j<=right){
            if(nums[i]<nums[j]){
               temp[t++]=nums[i++];
            }else {
                temp[t++]=nums[j++];
            }
        }
        while(i<=mid){
            temp[t++]=nums[i++];
        }
        while(j<=right){
            temp[t++]=nums[j++];
        }
        t=0;
        while(left<=right){
            nums[left++]=temp[t++];
        }
    }

}
