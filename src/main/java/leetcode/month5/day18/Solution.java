package leetcode.month5.day18;

public class Solution {




    public boolean validPalindrome(String s) {

        if(s==null ||s.isEmpty()){
            return false;
        }
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            char temp1=s.charAt(left);
            char temp2=s.charAt(right);
            if(temp1==temp2){
                left++;
                right--;
            }else {
                boolean flag1=true;
                boolean flag2=true;

                for(int i=left,j=right-1;i<j;i++,j--){
                    if(s.charAt(i)!=s.charAt(j)){
                        flag1=false;
                        break;
                    }
                }
                for(int i=left+1,j=right;i<j;i++,j--){
                    if(s.charAt(i)!=s.charAt(j)){
                        flag2=false;
                        break;
                    }
                }
                return flag1|| flag2;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution= new Solution();
        System.out.println(solution.validPalindrome("abc"));
    }
}
