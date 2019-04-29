package c14.demo1;

//看股票同事类
public class StockObserver {

    private String name;
    private Secretary sub;

    public StockObserver(String name, Secretary sub) {
        this.name = name;
        this.sub = sub;
    }

    //得到老板的通知，赶快采取行动
    public void update() {
        System.out.println(String.format("%s %s 关闭股票行情，继续工作! ", sub.getAction(), name));
    }

}
