package c01.demo3.duck;

import c01.demo3.fly.FlyBehavior;
import c01.demo3.quack.QuackBehavior;
import lombok.Setter;

//鸭子超类
public abstract class Duck {

    //通过set方法，我们可以"随时"调用这两个方法改变鸭子的行为
    @Setter
    FlyBehavior flyBehavior;
    @Setter
    QuackBehavior quackBehavior;

    public void swim() {
        System.out.println("All ducks float,even decoys!");
    }

    public abstract void display();

    //委托给行为类，不需要知道具体的对象是什么，只需要知道如何执行就行了
    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

}