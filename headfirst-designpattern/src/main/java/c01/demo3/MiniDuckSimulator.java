package c01.demo3;

import c01.demo3.duck.Duck;
import c01.demo3.duck.MallardDuck;
import c01.demo3.duck.ModelDuck;
import c01.demo3.fly.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}
