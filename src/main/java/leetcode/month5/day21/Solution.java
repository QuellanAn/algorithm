package leetcode.month5.day21;

import sun.reflect.generics.tree.Tree;
import tree.TreeNode;

import java.util.HashMap;

public class Solution {


    HashMap<Integer,Integer> indexMap=new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i],i);
        }
        return help(preorder,inorder,0,0,inorder.length-1);
    }

    public TreeNode help(int[] preorder,int[] inorder,int index,int in_left,int in_right){
        if(index>preorder.length ||in_left>in_right){
            return  null;
        }
        int root=preorder[index];
        TreeNode treeNode=new TreeNode(root);
        int mid=indexMap.get(root);
        int left_size=mid-in_left+1;
        treeNode.left=help(preorder,inorder,index+1,in_left,mid-1);
        treeNode.right=help(preorder,inorder,index+left_size,mid+1,in_right);
        return treeNode;
    }
}
