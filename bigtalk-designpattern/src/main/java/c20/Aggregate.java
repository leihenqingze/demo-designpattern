package c20;

//聚集抽象类
public interface Aggregate<T> {

    //创建迭代器
    Iterator<T> createIterator();

}