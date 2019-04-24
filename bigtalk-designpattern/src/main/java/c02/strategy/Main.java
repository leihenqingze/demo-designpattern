package c02.strategy;

import org.junit.Test;

//客户端代码
public class Main {

    @Test
    public void run() {
        //由于实例化不同的策略，所以最终在调用context.contextInterface()时，
        //所获得的结果就不尽相同
        Context context;
        context = new Context(new ConcreteStrategyA());
        context.contextInterface();
        context = new Context(new ConcreteStrategyB());
        context.contextInterface();
        context = new Context(new ConcreteStrategyC());
        context.contextInterface();
    }

}