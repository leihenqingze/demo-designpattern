package c25.mediator;

import lombok.AllArgsConstructor;

/**
 * 抽象同事类
 */
@AllArgsConstructor
public abstract class Colleague {

    //中介者对象
    protected Mediator mediator;

}