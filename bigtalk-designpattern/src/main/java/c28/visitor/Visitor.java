package c28.visitor;

//为该对象结构中ConcreteElement的每一个类声明一个visit操作
public interface Visitor {

    void visitConcreteElementA(ConcreteElementA concreteElementA);

    void visitConcreteElementB(ConcreteElementB concreteElementB);

}