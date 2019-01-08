package easy;

/**
 * @Description:
 * @Author: guojun
 * @Date: 2019/1/8
 */
public class MergeTwoSortedLists21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        ListNode head = new ListNode(0);
        head.next = l1;
        ListNode n1 = head;
        ListNode tmp1 = null;
        ListNode tmp2 = null;
        while (l2 != null) {
            while (n1.next != null && n1.next.val <= l2.val) {
                n1 = n1.next;
            }
            tmp1 = n1.next;
            n1.next = l2;
            tmp2 = l2.next;
            l2.next = tmp1;
            l2 = tmp2;
        }
        return head.next;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {val = x;}
    }
}
