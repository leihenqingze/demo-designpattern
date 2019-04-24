package c10.templatemethod;

import org.junit.Test;

public class Main {

    @Test
    public void run() {
        AbstractClass ac;

        ac = new ConcreteClassA();
        ac.TemplatMethod();

        ac = new ConcreteClassB();
        ac.TemplatMethod();
    }

}