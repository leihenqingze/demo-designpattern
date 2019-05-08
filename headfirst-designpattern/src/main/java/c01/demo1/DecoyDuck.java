package c01.demo1;

public class DecoyDuck extends Duck {

    //诱饵鸭既不会飞，也不会叫。
    @Override
    public void quack() {
    }

    @Override
    public void fly() {
    }

    @Override
    public void display() {
        System.out.println("诱饵鸭");
    }

}