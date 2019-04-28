package c14.delegation;

public class NBAObserver {

    private String name;
    private Subject subject;

    public NBAObserver(String name, Subject subject){
        this.name = name;
        this.subject = subject;
    }

    public void closeStockMarket(){
        System.out.println(String.format("%s %s 关闭NBA直播，继续工作! ",subject.getSubjectState(),name));
    }

}
