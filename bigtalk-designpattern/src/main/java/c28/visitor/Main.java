package c28.visitor;

import org.junit.Test;

public class Main {

    @Test
    public void run(){
        ObjectStructure o = new ObjectStructure();

        o.attach(new ConcreteElementA());
        o.attach(new ConcreteElementB());

        ConcreteVisitor1 visitor1 = new ConcreteVisitor1();
        ConcreteVisitor2 visitor2 = new ConcreteVisitor2();

        o.accept(visitor1);
        o.accept(visitor2);
    }

}
