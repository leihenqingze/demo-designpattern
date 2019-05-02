package c18.memento;

import lombok.Data;

//管理者类
@Data
public class Caretaker {

    //得到或设置备忘录
    private Memento memento;

}