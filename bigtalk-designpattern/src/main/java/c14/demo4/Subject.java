package c14.demo4;

//抽象通知者由于不希望依赖于抽象观察者，所以增加和减少的就没有必要了，
//抽象观察者已经不存在了，通知者接口如下
public interface Subject {

    void notifyObservers();

    String getSubjectState();

    String setSubjectState(String state);

}