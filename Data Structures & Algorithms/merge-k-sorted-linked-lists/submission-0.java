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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(-1);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode curr = lists[i];
            while(curr!=null){
                arr.add(curr.val);
                curr= curr.next;
            }
        }
        Collections.sort(arr);
        ListNode d=new ListNode(0);
        ListNode res = d;
        int i=0;
        while(i<arr.size()){
            ListNode l = new ListNode(arr.get(i));
            res.next =l;
            res =res.next;
            i++;
        }
    return d.next;
    }
}
