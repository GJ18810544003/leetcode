package baodian.linkedlist;

import baodian.Util;

/**
 * 链表排序，选择排序
 */
public class OrderLinkedList {

    public static void main(String[] args) {
        ListNode head = Util.generateLinkedList(10, 100);
        order(head);
        Util.printLinkedList(head);


    }

    public static void order(ListNode head) {
      ListNode curListNode = head;

      while (curListNode != null) {
          ListNode temp = curListNode;
          ListNode next = temp.getNext();
          while (next != null) {
              if (temp.getData() > next.getData()) {
                  int tempData = temp.getData();
                  temp.setData(next.getData());
                  next.setData(tempData);
              }
              next = next.getNext();
          }
          curListNode = curListNode.getNext();
      }
    }


}
