package c13.builder;

//Director类—指挥类
public class Director {

    //来指挥建造过程
    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }

}