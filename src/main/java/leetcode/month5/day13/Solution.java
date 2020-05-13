package leetcode.month5.day13;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {


    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> lists=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size=queue.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp=queue.poll();
                if(temp!=null){
                    list.add(temp.val);
                    queue.offer(temp.left);
                    queue.offer(temp.right);
                }
            }
            if(!list.isEmpty()){
                lists.add(list);
            }
        }
        return lists;
    }
}
