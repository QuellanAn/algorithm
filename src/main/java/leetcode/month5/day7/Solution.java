package leetcode.month5.day7;

import tree.TreeNode;

/**
 * @ClassName Solution
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/5/7 8:29
 * @Version 1.0
 */
public class Solution {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null && t==null){
            return true;
        }
        if (s==null || t==null){
            return false;
        }
        if(isSame(s,t)){
            return true;
        }
        return isSubtree(s.left,t) || isSubtree(s.right,t);
    }

    public boolean isSame(TreeNode x,TreeNode y){
        if(x==null && y==null){
            return true;
        }
        if(x==null || y==null){
            return false;
        }
        if(x.val==y.val){
            return isSame(x.left,y.left) && isSame(x.right,y.right);
        }
        return false;
    }
}
