package c08.leifeng;

import org.junit.Test;

public class Main {

    @Test
    public void simpleFactory() {
        //三句重复的代码，有重复也就有了坏味道
        //有简单工厂是一个静态方法，所以每次创建对象都需要指定创建的类型，就造成了重复
        LeiFeng studentA = new SimpleFactory().createLeiFeng("学雷锋的大学生");
        studentA.buyRice();
        LeiFeng studentB = new SimpleFactory().createLeiFeng("学雷锋的大学生");
        studentB.sweep();
        LeiFeng studentC = new SimpleFactory().createLeiFeng("学雷锋的大学生");
        studentC.wash();
    }

    @Test
    public void Factory() {
        //要换成'社区志愿者'，修改这里就可以
        //有每个工厂只创建同类型的产品，只要更改对应的工厂，则其创建的对象类型都会被更改
        Factory factory = new UndergraduateFactory();
        LeiFeng studentA = factory.createLeiFeng();
        studentA.buyRice();
        LeiFeng studentB = factory.createLeiFeng();
        studentB.sweep();
        LeiFeng studentC = factory.createLeiFeng();
        studentC.wash();
    }

}
