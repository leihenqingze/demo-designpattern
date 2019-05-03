package c28.visitor;

public class ConcreteElementB implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }

    //其他的相关方法
    public void operation(){

    }

}