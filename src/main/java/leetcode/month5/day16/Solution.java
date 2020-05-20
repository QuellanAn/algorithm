package leetcode.month5.day16;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {


    public int[] findOrder(int numCourses, int[][] prerequisites) {

        if(numCourses==0){ return new int[0];}

        int[] inDegress=new int[numCourses];

        for(int i=0;i<prerequisites.length;i++){
            inDegress[prerequisites[i][0]]++;
        }

        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<inDegress.length;i++){
            if(inDegress[i]==0){
                queue.offer(i);
            }
        }
        int count=0;
        int[] res=new int[numCourses];
        while(!queue.isEmpty()){
            int cuur=queue.poll();
            res[count++]=cuur;
            for(int[] p:prerequisites){
                if(p[1]==cuur){
                    inDegress[p[0]]--;
                    if(inDegress[p[0]]==0){
                        queue.offer(p[0]);
                    }
                }
            }
        }

        if(count==numCourses){
            return res;
        }else{
            return new int[0];
        }

    }
}
