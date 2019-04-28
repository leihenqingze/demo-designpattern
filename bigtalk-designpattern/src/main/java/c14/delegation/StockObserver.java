package c14.delegation;

public class StockObserver {

    private String name;
    private Subject subject;

    public StockObserver(String name,Subject subject){
        this.name = name;
        this.subject = subject;
    }

    public void closeStockMarket(){
        System.out.println(String.format("%s %s 关闭股票行情，继续工作! ",subject.getSubjectState(),name));
    }

}
