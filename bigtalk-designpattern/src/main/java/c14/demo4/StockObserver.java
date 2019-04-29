package c14.demo4;

//看股票的同事
public class StockObserver {

    private String name;
    private Subject subject;

    public StockObserver(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    //关闭股票行情
    public void closeStockMarket() {
        System.out.println(String.format("%s %s 关闭股票行情，继续工作! ", subject.getSubjectState(), name));
    }

}
