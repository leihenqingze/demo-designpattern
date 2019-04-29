package c14.demo4;

public class Main {

    //前面的例子中尽管已经用了依赖倒转原则，但是‘抽象通知者’还是依赖‘抽象观察者’，
    //也就是说，万一没有了抽象观察者这样的接口，我这通知的功能就完成不了了。
    //另外就是每个具体观察者，它不一定是调用'更新'这样的方法。
    public static void main(String[] args) {

        EventHandler eventHandler = new EventHandler();

        Boss huhansan = new Boss();

        StockObserver stockObserver = new StockObserver("魏关诧",huhansan);

        NBAObserver nbaObserver = new NBAObserver("易关查",huhansan);

        huhansan.setEventHandler(eventHandler);

        eventHandler.attach(() -> {
            stockObserver.closeStockMarket();
        });

        eventHandler.attach(() -> {
            nbaObserver.closeNBADirectSeeding();
        });

        huhansan.setSubjectState("我胡汉三回来了! ");
        huhansan.notifyObservers();

    }

}
