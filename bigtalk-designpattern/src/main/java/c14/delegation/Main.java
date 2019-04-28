package c14.delegation;

public class Main {

    public static void main(String[] args) {

        Boss huhansan = new Boss();

        StockObserver stockObserver = new StockObserver("魏关诧",huhansan);

        NBAObserver nbaObserver = new NBAObserver("易关查",huhansan);

        huhansan.setEventHandler(new EventHandler() {
            @Override
            public void update() {
                stockObserver.closeStockMarket();
            }
        });

        huhansan.setEventHandler(new EventHandler() {
            @Override
            public void update() {
                stockObserver.closeStockMarket();
            }
        });

        huhansan.setSubjectState("我胡汉三回来了! ");
        huhansan.notifyObservers();

    }

}
