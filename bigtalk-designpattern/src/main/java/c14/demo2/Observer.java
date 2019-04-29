package c14.demo2;

import lombok.AllArgsConstructor;

//增加了抽象的观察者
@AllArgsConstructor
public abstract class Observer {

    protected String name;
    protected Secretary sub;

    public abstract void update();

}
