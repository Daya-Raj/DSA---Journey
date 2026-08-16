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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null||head.next ==null)return head;
        ListNode tail = head;
        for(int i = 0;i<k;i++){
           if(tail==null)return head;
           tail = tail.next;
        }
        ListNode NewHead = reverse(head,tail);
        head.next = reverseKGroup(tail,k);
        return NewHead;
    }
    private ListNode reverse(ListNode y,ListNode x){
        ListNode prev = null;
        while(y!=x){
            ListNode next = y.next;
            y.next = prev;
            prev = y;
            y = next;
        }
        return prev;
    }
}