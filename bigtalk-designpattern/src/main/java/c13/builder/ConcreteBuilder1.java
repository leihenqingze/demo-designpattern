package c13.builder;

//ConcreteBuilder1类—具体建造者类
public class ConcreteBuilder1 implements Builder {

    private Product product = new Product();

    //建造具体的两个部件
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