package c13.builder;

//Builder类—抽象建造者类，确定产品由两个部件PartA和PartB组成，
//并声明一个得到产品建造后结果的方法getResult
public interface Builder {

    void buildPartA();

    void buildPartB();

    Product getResult();

}