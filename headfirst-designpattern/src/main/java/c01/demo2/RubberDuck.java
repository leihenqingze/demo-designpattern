package c01.demo2;

public class RubberDuck extends Duck implements Quackable {

    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }

    @Override
    public void display() {
        System.out.println("橡皮鸭");
    }

}