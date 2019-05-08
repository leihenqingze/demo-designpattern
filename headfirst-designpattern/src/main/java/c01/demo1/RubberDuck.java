package c01.demo1;

//橡皮鸭不应该会飞，但是现在也会飞了。
public class RubberDuck extends Duck {

    //橡皮鸭不会呱呱叫，所以把quack的定义覆盖成吱吱叫
    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }

    @Override
    public void display() {
        System.out.println("橡皮鸭");
    }

}