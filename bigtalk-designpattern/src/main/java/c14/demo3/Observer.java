package c14.demo3;

import lombok.AllArgsConstructor;

//增加了抽象的观察者
@AllArgsConstructor
public abstract class Observer {

    protected String name;
    //原来是'前台'，现在改成了'抽象通知者'
    protected Subject sub;

    public abstract void update();

}
