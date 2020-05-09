package leetcode.month5.day9;

/**
 * @ClassName Solution
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/5/9 8:27
 * @Version 1.0
 */
public class Solution {

    public int mySqrt1(int x) {
        int i=0;
        int temp=0;
        while(temp<=x && temp>=0){
            i++;
            if(i==46340){
                System.out.println(i);
            }
            temp=i*i;
        }
        return i-1;
    }



    public int mySqrt2(int x) {
       int left=0;
       int right=x;
       int result=0;
       while(left<=right){
           int mid=(left+right)/2;
           if((long)mid*mid<=x){
               result=mid;
               left=mid+1;
           }else {
               right=mid-1;
           }
       }
        return result;
    }
    public int mySqrt(int x) {
        int left=0;
        int right=x;
        int result=0;
        while(left<=right){
            int mid=(left+right)/2;
            if(mid<=x/mid){
                result=mid;
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        Math.sqrt(1234);
        System.out.println(solution.mySqrt(2147395600));
    }
}
