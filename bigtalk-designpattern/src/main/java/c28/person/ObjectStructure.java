package c28.person;

import com.google.common.collect.Lists;

import java.util.List;

//对象结构
//由于总是需要男人与女人在不同状态的对比，所以我们需要一个
//对象结构类来针对不同的状态遍历男人与女人，得到不同的反应。
public class ObjectStructure {

    private List<Person> elements = Lists.newArrayList();

    public void attach(Person element) {
        elements.add(element);
    }

    public void detach(Person element) {
        elements.remove(element);
    }

    public void display(Action visitor) {
        for (Person e : elements) {
            e.accept(visitor);
        }
    }

}
