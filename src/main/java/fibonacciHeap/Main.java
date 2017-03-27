package fibonacciHeap;

import java.awt.peer.SystemTrayPeer;

/**
 * Created by u4s5 on 25.03.17.
 */
public class Main {

    public static void main(String[] args) {
        FibonacciHeap fb = new FibonacciHeap();
        StringBuilder log = new StringBuilder();
        fb.add(1, log);
        fb.add(-5, log);
        fb.add(4, log);
        System.out.println(fb.extractMin(log));
        System.out.println(fb.extractMin(log) + "\n\n\n");

        System.out.println(log.toString());
    }

}
