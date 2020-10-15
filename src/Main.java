import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 1; i <=20; i++) {
            System.out.print(random.nextInt(1000) + " ");
        }

        System.out.println();
        Random random1 = new Random(1000);
        for (int i = 1; i <=20; i++) {
            System.out.print(random1.nextInt(100) + " ");

        }



        System.out.println("Hello World!");
    }
}
