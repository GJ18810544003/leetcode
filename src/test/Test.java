package test;

import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static String appendStr(String s) {
        s += "bbb";
        return s;
    }

    public static void main(String[] args) {
        int a = 3;
        int b =  a++ + ++a;
        System.out.println(a + "," + b);
    }

}
