package baodian.linkedlist;

import baodian.Util;

/**
 * 寻找链表倒数第k个元素
 */
public class LastKElement {

    public static void main(String[] args) {
        ListNode head = Util.generateLinkedList(10, 100);
        System.out.println(findLastKElement(head, 3));


    }

    public static int findLastKElement(ListNode head, int k) {
        if (head == null) {
            return 0;
        }

        ListNode slow = head;
        ListNode fast = head;
        for (int i =1; i <= k-1; i++) {
            fast = fast.getNext();
        }
        while (fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext();
        }
        return slow.getData();
    }
}
