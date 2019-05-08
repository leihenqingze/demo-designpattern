package c01.demo3.duck;

import c01.demo3.fly.FlyWithWings;
import c01.demo3.quack.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a mallard duck");
    }

}
