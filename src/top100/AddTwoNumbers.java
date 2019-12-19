package top100;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 *
 * serial: 2
 * difficulty: medium
 *
 * @Author: guojun
 * @Date: 2019/12/17
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        List<ListNode> nodeList = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            nodeList.add(new ListNode(9));
        }

        ListNode node = new ListNode(1);
        ListNode temp = node;
        for (ListNode node1 : nodeList) {
            temp.next = node1;
            temp = node1;
        }

        ListNode l1 = node;
        System.out.print("l1: ");
        while (l1 != null) {
            System.out.print(l1.val + "->");
            l1 = l1.next;
        }
        System.out.println();

        ListNode node2 = new ListNode(9);

        ListNode l2 = node2;
        System.out.print("l2: ");
        while (l2 != null) {
            System.out.print(l2.val + "->");
            l2 = l2.next;
        }
        System.out.println();

        ListNode res = addTwoNumbers(node, node2);

        System.out.print("re: ");
        while (res != null) {
            System.out.print(res.val + "->");
            res = res.next;
        }

    }

    /**
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        int carry = 0;
        ListNode resNode = new ListNode(0);
        ListNode currentNode = resNode;
        while(l1 != null && l2 != null) {
            ListNode nextNode = null;
            if (l1.val + l2.val + carry > 9) {
                nextNode = new ListNode(l1.val + l2.val + carry - 10);
                carry = 1;
            }else {
                nextNode = new ListNode(l1.val + l2.val + carry);
                carry = 0;
            }
            currentNode.next = nextNode;
            currentNode = nextNode;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            if (l1.val + carry > 9) {
                ListNode nextNode = new ListNode(l1.val + carry - 10);
                currentNode.next = nextNode;
                currentNode = nextNode;
                l1 = l1.next;
                carry = 1;
            }else {
                ListNode nextNode = new ListNode(l1.val + carry);
                nextNode.next = l1.next;
                currentNode.next = nextNode;
                return resNode.next;

            }
        }

        while (l2 != null) {
            if (l2.val + carry > 9) {
                ListNode nextNode = new ListNode(l2.val + carry - 10);
                currentNode.next = nextNode;
                currentNode = nextNode;
                l2 = l2.next;
                carry = 1;
            }else {
                ListNode nextNode = new ListNode(l2.val + carry);
                nextNode.next = l2.next;
                currentNode.next = nextNode;
                return resNode.next;
            }
        }


        if (carry == 1) {
            ListNode nextNode = new ListNode(carry);
            currentNode.next = nextNode;
        }

        return resNode.next;
    }







  public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }

}
