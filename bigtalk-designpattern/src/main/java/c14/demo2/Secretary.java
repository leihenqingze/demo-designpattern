package c14.demo2;

import com.google.common.collect.Lists;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

//前台秘书类，把所有的与具体观察者耦合的地方都改为了抽象观察者
public class Secretary {

    //同事列表
    private List<Observer> observers = Lists.newArrayList();
    //前台状态
    @Getter
    @Setter
    private String action;

    //增加，针对抽象编程，减少了与具体类的耦合
    public void attach(Observer observer) {
        observers.add(observer);
    }

    //减少
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    //通知
    public void notifyObserver() {
        observers.forEach(Observer::update);
    }

}