package c14.demo3;

//通知者接口
//具体的通知者类可能是前台，也可能是老板，它们也许有各自的一些方法，
//但对于通知者来说，它们是一样的，所以它们都去实现这个接口。
public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObserver();

    String getAction();

    void setAction(String action);

}