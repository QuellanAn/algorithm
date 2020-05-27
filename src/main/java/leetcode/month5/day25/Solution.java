package leetcode.month5.day25;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int subarraysDivByK(int[] A, int K) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0,1);
        int [] p=new int[A.length];
        if(A.length>0){
            p[0]=A[0];
        }
        for (int i = 1; i < A.length; i++) {
            p[i]=p[i-1]+A[i];
        }
        int count=0;
        for (int i : p) {
            int mod=Math.floorMod(i,K);
            int value=hashMap.getOrDefault(mod,0);
            count+=value;
            hashMap.put(mod,value+1);
        }


        return count;
    }


    public int subarraysDivByK2(int[] A, int K) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0,1);
        int count=0;
        int sum=0;
        for (int i : A) {
            sum+=i;
            int mod=(sum%K+K)%K;
            int same=hashMap.getOrDefault(mod,0);
            count+=same;
            hashMap.put(mod,same+1);
        }
        return count;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a={5};

        System.out.println(-5%3);
        System.out.println((-5%3+3)%3);
        System.out.println( Math.floorMod(-5, 3));
        System.out.println(solution.subarraysDivByK(a,9));
    }
}
