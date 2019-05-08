package c01.demo3.duck;

import c01.demo3.fly.FlyWithWings;
import c01.demo3.quack.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a redhead duck");
    }

}