package c14.observer;

import lombok.Getter;
import lombok.Setter;

//ConcreteSubject类，叫做具体主题或具体通知者，
//将有关状态存入具体观察者对象，在具体主题的内部状态改变时，
//给所有登记过的观察者发出通知。具体主题角色通常用一个具体子类实现。
public class ConcreteSubject extends Subject {

    // 具体被观察者状态
    @Getter
    @Setter
    private String subjectState;

}
