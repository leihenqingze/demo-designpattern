package c14.demo2;

//看股票的同事
//具体的观察者，继承抽象观察者，对于update的方法做重写操作
public class StockObserver extends Observer {

    public StockObserver(String name, Secretary sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(String.format("%s %s 关闭股票行情，继续工作! ", sub.getAction(), name));
    }

}