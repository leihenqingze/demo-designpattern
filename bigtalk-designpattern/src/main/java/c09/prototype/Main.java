package c09.prototype;

import org.junit.Test;

public class Main {

    @Test
    public void run(){
        Prototype p1 = new Prototype("I");
        Prototype p2 = p1.clone();
        System.out.println("Cloned：" + p2.getId());
    }

}
