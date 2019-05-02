package c18.memento;

import lombok.Getter;

//备忘录
public class Memento {

    //需要保存的数据属性，可以是多个
    @Getter
    private String state;

    //构造方法，将相关数据导入
    public Memento(String state) {
        this.state = state;
    }

}