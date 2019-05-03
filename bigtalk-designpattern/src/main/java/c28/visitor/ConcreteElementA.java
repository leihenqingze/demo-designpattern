package c28.visitor;

//具体元素，实现accept操作
public class ConcreteElementA implements Element {

    //充分利用双分派技术，实现处理与数据结构的分离
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }

    //其他的相关方法
    public void operation(){

    }

}