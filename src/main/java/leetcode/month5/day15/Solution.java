package leetcode.month5.day15;

import node.ListNode;

public class Solution {


    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode root=new ListNode(0);
        root.next=head;
        ListNode pre=root;
        ListNode end=root;

        while(end.next!=null){
            for(int i=0;i<k && end!=null;i++){
                end=end.next;
            }
            if(end==null){
                break;
            }
            ListNode start=pre.next;
            ListNode next=end.next;
            end.next=null;
            pre.next=reverse(start);
            start.next=next;
            pre=start;
            end=pre;

        }
        return root.next;
    }

    private ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
}
