package c19.component;

public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    //通常都用add和remove方法来提供增加或移除树叶或树枝的功能
    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void display(int depth);

}