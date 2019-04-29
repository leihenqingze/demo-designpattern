package c14.demo2;

//客户端
public class Main {

    //在具体观察者中，与‘前台秘书’这个具体的类耦合了。
    //‘前台秘书’是一个具体的类，也应该抽象出来
    //公司最后一次，老板回来，前台来不及电话了，于是通知大家的任务变成谁来做？
    //是老板，对的，其实老板也好，前台也好，都是具体的通知者，这里观察者也不应该依赖具体的实现，而是一个抽象的通知者。
    //另外，就算是前台，如果某一个同事和她有矛盾，她生气了，于是不再通知这位同事，
    //此时，她是否应该把这个对象从她加入的观察者列表中删除？
    //“调用detach方法将其减去就可以了。”
    public static void main(String[] args) {
        // 前台小组童子喆
        Secretary secretary = new Secretary();
        // 看股票的同事
        Observer observer1 = new StockObserver("魏关姹", secretary);
        Observer observer2 = new NBAObserver("易管查", secretary);
        //前台记下了两位同事
        secretary.attach(observer1);
        secretary.attach(observer2);
        //发现老板回来
        secretary.setAction("老板回来了!");
        //通知两个同事
        secretary.notifyObserver();
    }

}