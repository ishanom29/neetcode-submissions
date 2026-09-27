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
        if(head==null || head.next==null)
        return ;
        ArrayList<Integer> a= new ArrayList<>();
        ListNode curr = head;
        while(curr != null)
        {
            a.add(curr.val);
            curr=curr.next;
        }

        int i =0;
        int j =a.size()-1;
        while(i<=j){
             if(i!=0 && i!=j){
                head.next = new ListNode(a.get(i));
                head=head.next;
             }
             head.next = new ListNode(a.get(j));
            head=head.next;
             i++;
             j--;

        }
    }
}
