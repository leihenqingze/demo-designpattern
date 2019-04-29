package c14.demo3;

import com.google.common.collect.Lists;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

//老板
public class Boss implements Subject {

    //同事列表
    private List<Observer> observers = Lists.newArrayList();

    @Getter
    @Setter
    private String action;

    //增加，针对抽象编程，减少了与具体类的耦合
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    //减少
    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    //通知
    @Override
    public void notifyObserver() {
        observers.forEach(Observer::update);
    }

}