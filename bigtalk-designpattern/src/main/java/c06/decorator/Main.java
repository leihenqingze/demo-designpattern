package c06.decorator;

public class Main {

    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA(c);
        ConcreteDecoratorB d2 = new ConcreteDecoratorB(d1);
        d2.operation();
    }

}