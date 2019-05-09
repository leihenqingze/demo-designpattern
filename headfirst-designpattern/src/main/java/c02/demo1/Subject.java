package c02.demo1;

//主题接口
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    /**
     * 当主题状态改变时，这个方法会被调用，以通知所有的观察者
     */
    void notifyObservers();

}