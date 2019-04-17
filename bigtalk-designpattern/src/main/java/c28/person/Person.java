package c28.person;

/**
 * 人抽象类
 */
public interface Person {

    //用来获得'状态'对象
    void accept(Action visitor);

}
