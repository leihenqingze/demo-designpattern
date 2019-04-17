package c28.visitor;

public class ConcreteElementA implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }

}