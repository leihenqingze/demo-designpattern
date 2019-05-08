package c01.demo3.fly;

//这是飞行行为的实现，给"会"飞的鸭子用
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }

}
