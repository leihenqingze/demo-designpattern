package c13;

public class ConcreteBuilder2 implements Builder {

    private Product product = new Product();

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