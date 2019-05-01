package c13.builder;

public class Main {

    //客户端不需要知道具体的建造过程
    public static void main(String[] args) {

        Director director = new Director();

        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();

        //指挥者用ConcreteBuilder1的方法来建造产品
        director.construct(b1);
        Product p1 = b1.getResult();
        p1.show();

        director.construct(b2);
        Product p2 = b2.getResult();
        p2.show();

    }

}