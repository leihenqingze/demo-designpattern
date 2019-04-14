package c22.bridge;

import org.junit.Test;

public class Main {

    @Test
    public void run(){
        Abstraction abstraction = new RefinedAbstraction();

        abstraction.setImplementor(new ConcreteImplementorA());
        abstraction.operation();

        abstraction.setImplementor(new ConcreteImplementorB());
        abstraction.operation();

    }

}
