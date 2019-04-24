package c10.templatemethod;

//抽象类，实现了一些模板方法
//AbstractClass是抽象类，其实也就是一抽象模板，定义并实现了一个模板方法。
//这个模板方法一般是一个具体方法，它给出了一个顶级逻辑的骨架，而逻辑的组
//成步骤在相应的抽象操作中，推迟到子类实现。顶级逻辑也有可能调用一些具体方法。
public abstract class AbstractClass {

    //一些抽象行为，放到子类中其实现
    public abstract void primitiveOperation1();

    public abstract void primitiveOperation2();

    //模板方法，给出了逻辑的骨架，而逻辑的组成是一些相应的抽象操作，他们都推迟到子类中去实现
    public final void TemplatMethod() {

        primitiveOperation1();
        primitiveOperation2();

    }

}