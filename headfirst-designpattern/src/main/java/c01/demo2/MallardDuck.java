package c01.demo2;

public class MallardDuck extends Duck implements Flyable, Quackable {

    @Override
    public void display() {
        System.out.println("绿头");
    }

    @Override
    public void fly() {
        System.out.println("飞行");
    }

    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }

}
