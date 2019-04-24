package c10.templatemethod;

//ConcreteClass，实现父类所定义的一个或多个抽象方法。每一个AbstractClass
//都可以有任意多个ConcreteClass与之对应，而每一个ConcreteClass都可以给出
//这些抽象方法(也就是顶级逻辑的组成步骤)的不同实现，从而使得顶级逻辑的实现各不相同。
public class ConcreteClassA extends AbstractClass {

    @Override
    public void primitiveOperation1() {
        System.out.println("类A具体实现方法1");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("类A具体实现方法2");
    }

}
