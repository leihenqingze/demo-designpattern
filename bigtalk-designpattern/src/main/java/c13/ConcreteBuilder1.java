package c13;

public class ConcreteBuilder1 implements Builder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件 A");
    }

    @Override
    public void buildPartB() {
        product.add("部件 B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}