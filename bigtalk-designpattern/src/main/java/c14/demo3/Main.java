package c14.demo3;

//客户端
public class Main {

    //观察者和被观察者不再耦合
    public static void main(String[] args) {
        //老板胡汉三
        Boss boss = new Boss();
        // 看股票的同事
        Observer observer1 = new StockObserver("魏关姹", boss);
        Observer observer2 = new NBAObserver("易管查", boss);
        //前台记下了两位同事
        boss.attach(observer1);
        boss.attach(observer2);
        //魏关姹其实是没有被老板通知到，所以减去
        boss.detach(observer1);
        //老板回来
        boss.setAction("我胡汉三回来了！");
        //发出通知
        boss.notifyObserver();
    }

}