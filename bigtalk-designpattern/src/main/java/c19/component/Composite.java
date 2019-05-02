package c19.component;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public void display(int depth) {
        System.out.println(new String("-") + name);
        for (Component component : components) {
            component.display(depth + 2);
        }
    }

}