package intervew;

import java.util.HashMap;
import java.util.Map;

public class LRU {

    static class LRUCache {
        Map<Integer, Node> map = new HashMap<Integer, Node>(16);
        Node head;
        Node tail;
        int currentNum = 0;
        int capcitty = 0;

        LRUCache(int capcity) {
            this.capcitty = capcity;
            head.next = tail;
        }

        public void set(int key, int value) {

        }
    }


    static class Node {
        int data;
        Node pre = null;
        Node next = null;

        Node() {}

        Node(int data) {
            this.data = data;
        }
    }
}
