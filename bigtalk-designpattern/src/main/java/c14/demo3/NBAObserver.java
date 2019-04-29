package c14.demo3;

//看NBA的同事
public class NBAObserver extends Observer {

    public NBAObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(String.format("%s %s 关闭NBA直播，继续工作! ", sub.getAction(), name));
    }

}