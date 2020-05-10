package leetcode.month5.day10;

import tree.TreeNode;

public class Solution {

    private TreeNode ans;


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ans=null;
        dfs(root,p,q);
        return ans;
    }


    public boolean dfs(TreeNode node,TreeNode p,TreeNode q){
        if(node==null){
            return false;
        }
        boolean left=dfs(node.left,p,q);
        boolean right=dfs(node.right,p,q);

        if((left && right)|| node.val==p.val || node.val==q.val){
            ans=node;
        }
        return left|| right || node.val==p.val || node.val==q.val;
    }
}
