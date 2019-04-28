package c08.leifeng;

import org.junit.Test;

public class Main {

    @Test
    public void simpleFactory() {
        //三句重复的代码，有重复也就有了坏味道
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
        Factory factory = new UndergraduateFactory();
        LeiFeng studentA = factory.createLeiFeng();
        studentA.buyRice();
        LeiFeng studentB = factory.createLeiFeng();
        studentB.sweep();
        LeiFeng studentC = factory.createLeiFeng();
        studentC.wash();
    }

}
