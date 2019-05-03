package c28.visitor;

import com.google.common.collect.Lists;

import java.util.List;

//能枚举它的元素，可以提供一个高层的接口以允许访问者访问它的元素
public class ObjectStructure {

    private List<Element> elements = Lists.newArrayList();

    public void attach(Element element) {
        elements.add(element);
    }

    public void detach(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }

}
