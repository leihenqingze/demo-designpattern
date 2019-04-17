package c28.person;

import com.google.common.collect.Lists;

import java.util.List;

//对象结构
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
