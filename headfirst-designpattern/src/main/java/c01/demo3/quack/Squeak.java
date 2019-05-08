package c01.demo3.quack;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Squeak >>");
    }

}