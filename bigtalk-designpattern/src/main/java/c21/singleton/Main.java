package c21.singleton;

import org.junit.Test;

public class Main {

    @Test
    public void idler() {
        Idler idler1 = Idler.getInstance();
        Idler idler2 = Idler.getInstance();
        if (idler1 == idler2) {
            System.out.println("两个对象是相同的实例。");
        }
    }

}