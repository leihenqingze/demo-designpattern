package c01.demo3.duck;

import c01.demo3.fly.FlyNoWay;
import c01.demo3.quack.MuteQuack;

public class ModelDuck extends Duck {

    //一开始，模型鸭是不会飞的
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }

}