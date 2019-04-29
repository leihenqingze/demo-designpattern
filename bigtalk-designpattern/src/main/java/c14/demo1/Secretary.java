package c14.demo1;

import com.google.common.collect.Lists;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

//前台秘书类
public class Secretary {

    //同事列表，就是有几个同事请前台帮忙，于是就给集合增加几个对象
    private List<StockObserver> observers = Lists.newArrayList();
    //前台状态，前台通过电话，所说的话或所做的事
    @Getter
    @Setter
    private String action;

    //增加
    public void attach(StockObserver observer) {
        observers.add(observer);
    }

    //通知，待老板来时，就给所有的登记的同事们发通知，"老板来了"
    public void notifyObserver() {
        observers.forEach(StockObserver::update);
    }

}