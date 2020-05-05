package leetcode.month4.day17;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Solution
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/4/29 8:10
 * @Version 1.0
 */
public class Solution {

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start=0;
        int end=mountainArr.length()-1;
        int mid=0;
        while(start<end){
            mid=(start+end)/2;
            int temp=mountainArr.get(mid);
            int left=mountainArr.get(mid-1);
            int right=mountainArr.get(mid+1);
            if(temp>=left && temp>= right){
                break;
            }else if(temp<=right){
                start=mid;
            }else{
                end=mid;
            }
        }
        int min=binarySearch(target,mountainArr,0,mid,true);
        if(min==-1){
            min=binarySearch(target,mountainArr,mid,mountainArr.length()-1,false);
        }
        return min;
    }

    public int binarySearch(int target, MountainArray mountainArr,int left,int right,boolean flag){
        while(left<=right){
            int mid=(left+right)/2;
            int temp=mountainArr.get(mid);
            if(temp==target){
                return mid;
            }
            if(flag){
                if(target<=temp ){
                    right=mid-1;
                }else {
                    left=mid+1;
                }
            }else{
                if(target>=temp){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(2);
        MountainArray mountainArray=new MountainArrayImpl(list);
        System.out.println(solution.findInMountainArray(4,mountainArray));
    }
}
