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
        ListNode p1 = head;
        ListNode p2 = head.next;

        while(p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }

        ListNode mid = p1.next;
        p1.next = null;
        ListNode prev = null;

        while(mid != null) {
            ListNode temp = mid.next;
            mid.next = prev;
            prev = mid;
            mid = temp;
        }

        ListNode left = head;
        mid = prev;

        while(mid != null) {
            ListNode t1 = left.next;
            ListNode t2 = mid.next;
            left.next = mid;
            left = t1;
            mid.next = t1;
            mid = t2;
        }
    }
}
