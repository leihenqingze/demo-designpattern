package c02.strategy;

//具体算法A，封装了具体的算法或行为
public class ConcreteStrategyA implements Strategy {

    //算法A实现方法
    @Override
    public void algorithmInterface() {
        System.out.println("算法A实现");
    }

}
