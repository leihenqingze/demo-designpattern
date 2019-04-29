package c14.demo1;

//客户端
public class Main {

    //这个‘前台’类和这个‘看股票者’类之间互相耦合，前台类要增加观察者，观察者类需要前台的状态。
    //如果观察者当中还有人想看NBA的网上直播，‘前台’类代码就得改了”
    //首先开放-封闭原则，修改原有代码就说明设计不够好。其次是依赖倒转原则，我们应该让程序都依赖于抽象，而不是相互依赖。
    public static void main(String[] args) {
        // 前台小组童子喆
        Secretary secretary = new Secretary();
        // 看股票的同事
        StockObserver observer1 = new StockObserver("魏关姹", secretary);
        StockObserver observer2 = new StockObserver("易管查", secretary);
        //前台记下了两位同事
        secretary.attach(observer1);
        secretary.attach(observer2);
        //发现老板回来
        secretary.setAction("老板回来了!");
        //通知两个同事
        secretary.notifyObserver();
    }

}