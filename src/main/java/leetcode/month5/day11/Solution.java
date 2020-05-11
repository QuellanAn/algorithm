package leetcode.month5.day11;

public class Solution {


    double myPow(double x, int n) {
        long index=n;
        if(n>=0){
            return help(x,n);
        }else {
            return 1.0/help(x,-n);
        }

    }


    double help(double x,long n){
        if(n==0){
            return 1.0;
        }
        double y=help(x,n/2);
        if(n%2==0){
            return y*y;
        }else {
            return y*y*x;
        }
    }
}
