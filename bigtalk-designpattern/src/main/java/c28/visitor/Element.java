package c28.visitor;

//定义一个accept操作，它以一个访问者为参数
public interface Element {

    void accept(Visitor visitor);

}