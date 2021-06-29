package baodian.linkedlist;

import baodian.Util;

/**
 * 反转链表:
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 * leetcode:https://leetcode-cn.com/problems/reverse-linked-list/
 */
public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode head = Util.generateLinkedList(10, 100);
        ListNode reverseHead = reverse(head);
        Util.printLinkedList(reverseHead);

    }

    public static ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode preListNode = null;
        ListNode curListNode = head;
        ListNode next = null;

        while (curListNode != null) {
            next = curListNode.next;
            curListNode.next = preListNode;

            preListNode = curListNode;
            curListNode = next;
        }
        return preListNode;
    }
}
