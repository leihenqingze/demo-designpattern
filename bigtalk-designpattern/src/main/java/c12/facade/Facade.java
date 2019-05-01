package c12.facade;

public class Facade {

    private SubSystemOne one;
    private SubSystemTwo two;
    private SubSystemThree three;
    private SubSystemFour four;

    //外观类，需要了解所有的子系统的方法或属性，进行组合，以备外界调用
    public Facade(){
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public void methodA(){
        System.out.println("\n方法组A() --- ");
        one.methodOne();
        two.methodTwo();
        four.methodFour();
    }

    public void methodB(){
        System.out.println("\n方法组B() --- ");
        two.methodTwo();
        three.methodThree();
    }

}