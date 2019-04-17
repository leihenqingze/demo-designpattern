package c28.person;

/**
 * 状态抽象类
 */
public interface Action {

    //得到男人结论或反应
    void getManConclusion(Man concreteElementA);

    //得到女人结论或反应
    void getWomanConclusion(Woman concreteElementB);

}
