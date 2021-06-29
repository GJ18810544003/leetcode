package test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Father {

    private int i = initI();
    public int initI() {
        System.out.println("Father.initI()");
        return 1;
    }

    public void g() {
        System.out.println("Father.g()");
    }

    Father () {
        System.out.println("Father.constructor, i = " + i);
        g();
    }

    public static void main(String[] args) {
        new Son(5);
    }
}

class Son extends Father {
    private int k = 1;

    private int j = initJ();

    Son(int k) {
        System.out.println("Son.constructor");
        this.k = k;
    }

    public int initJ() {
        System.out.println("Son.initJ");
        return 1;
    }

    public void g() {
        System.out.println("Son.g(), k = " + k);

    }

}
