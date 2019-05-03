package c28.demo1;

import lombok.Data;

@Data
public abstract class Person {

    protected String action;

    //得到结论或反应
    public abstract void getConclusion();

}
