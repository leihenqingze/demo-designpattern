package c13.builder;

public class ConcreteBuilder2 implements Builder {

    private Product product = new Product();

    //建造具体的两个部件
    @Override
    public void buildPartA() {
        product.add("部件 X");
    }

    @Override
    public void buildPartB() {
        product.add("部件 Y");
    }

    @Override
    public Product getResult() {
        return product;
    }

}