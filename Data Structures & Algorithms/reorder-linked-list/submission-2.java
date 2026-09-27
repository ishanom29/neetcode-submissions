/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode second = head;
        ListNode first = head.next;
        if(first==null)
        return ;
        while(first!=null && first.next!=null){
            second= second.next;
            first=first.next.next;
        }
        ListNode rev =second.next;
        second.next= null;
        ListNode prev= null;
        ListNode currhead=null;
        while(rev!=null){
         ListNode   next =rev.next;
            rev.next = prev;
            prev= rev;
            rev=next;
        }
        first = head;
        second = prev;
        while(second!=null){
            ListNode tmp1= first.next;
            ListNode tmp2 = second.next;
            first.next= second;
            second.next =tmp1;
            first=tmp1;
            second =tmp2;
        }

    }
}
