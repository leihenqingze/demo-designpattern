package c01.demo1;

//鸭子超类
public abstract class Duck {

    //所有的鸭子都会呱呱叫也会游泳，所以由超类负责处理这部分的实现代码
    public void quack() {
        System.out.println("呱呱叫");
    }

    public void swim() {
        System.out.println("游泳");
    }

    //因为每一种鸭子的外观都不同，所以该方法是抽象的，每个鸭子子类负责实现自己的display方法。
    public abstract void display();

    public void fly() {
        System.out.println("飞行");
    }

}