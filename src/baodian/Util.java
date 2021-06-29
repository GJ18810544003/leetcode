package baodian;

import baodian.linkedlist.ListNode;

import java.util.Random;

public class Util {

    /**
     * 随机生成一个链表
     * @param size 链表长度
     * @param maxVale 链表生成元素的范围
     * @return
     */
    public static ListNode generateLinkedList(int size, int maxVale) {
        ListNode dummyListNode = new ListNode(-1);
        ListNode curListNode = dummyListNode;

        Random random = new Random();
        for (int i = 1; i <= size; i++) {
            ListNode listNode = new ListNode(random.nextInt(maxVale));
            curListNode.setNext(listNode);
            curListNode = listNode;
        }
        System.out.println("链表已经生成：");
        printLinkedList(dummyListNode.getNext());

        return dummyListNode.getNext();
    }

    public static void printLinkedList(ListNode head) {
        if (head == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(head.getData());

        ListNode listNode = head.getNext();
        while (listNode != null) {
            sb.append("->").append(listNode.getData());
            listNode = listNode.getNext();
        }
        System.out.println("链表元素为：" + sb.toString());
    }

    public static int[] generateArray(int max, int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max);
        }
        System.out.println("数组已生成：");
        printArray(array);
        return array;
    }

    public static void printArray(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("数组元素为：[").append(array[0]);
        for (int i = 1; i < array.length; i++) {
            sb.append(", ").append(array[i]);
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
