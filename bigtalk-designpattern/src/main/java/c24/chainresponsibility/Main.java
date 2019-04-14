package c24.chainresponsibility;

import org.junit.Test;

public class Main {

    @Test
    public void run() {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        int[] requests = {2, 5, 14, 22, 18, 3, 27, 20};

        for (int request : requests) {
            h1.handleRequest(request);
        }

    }

}