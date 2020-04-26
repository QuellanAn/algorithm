package leetcode.day13;

import node.ListNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName Solution
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/4/26 8:22
 * @Version 1.0
 */
public class Solution {


    public ListNode mergeKLists(ListNode[] lists) {
        ListNode root=new ListNode(0);
        ListNode node=null;
        root.next=node;
        for(int i=0;i<lists.length;i++){
            node=merge(lists[i],node);
        }

        return root.next;
    }
    public ListNode merge2(ListNode l1,ListNode listNode){
        ListNode root=new ListNode(0);
        ListNode node=root;
        while(l1!=null && listNode !=null){
            ListNode temp=node;
            if(l1.val>listNode.val){
                temp.next=new ListNode(listNode.val);;
                listNode=listNode.next;
            }else{
                temp.next=new ListNode(l1.val);
                l1=l1.next;
            }
            node=temp.next;
        }
        if(l1!=null){
            node.next=l1;
        }
        if(listNode!=null){
            node.next=listNode;
        }
        return node.next;
    }


    public static void main(String[] args) {
        Solution solution= new Solution();

        ListNode[] lists=new ListNode[3];
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(5);
        lists[0]=l1;

        ListNode l2=new ListNode(1);
        l2.next=new ListNode(3);
        l2.next.next=new ListNode(4);
        lists[1]=l2;

        ListNode l3=new ListNode(2);
        l3.next=new ListNode(6);
        lists[2]=l3;

        System.out.println(solution.mergeKLists(lists));


    }


    public ListNode mergeKLists1(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return merge(lists, 0, lists.length - 1);
    }

    private ListNode merge(ListNode[] lists, int left, int right) {
        if (left == right) {
            return lists[left];
        }
        int mid = left + (right - left) / 2;
        ListNode node1 = merge(lists, left, mid);
        ListNode node2 = merge(lists, mid + 1, right);
        return merge(node1, node2);
    }

    private ListNode merge(ListNode node1, ListNode node2) {
        if (node1 == null || node2 == null) {
            return node1 == null ? node2 : node1;
        }
        if (node1.val < node2.val) {
            node1.next = merge(node1.next, node2);
            return node1;
        } else {
            node2.next = merge(node1, node2.next);
            return node2;
        }

    }


}
