package c19.component;

public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    //由于叶子没有再增加分支和树叶，所以add和remove方法实现它没有意义，
    //但这样做可以消除叶节点和枝节点对象在抽象层次的区别，它们具备完全一致的接口。
    @Override
    public void add(Component component) {
        System.out.println("Cannot add to a leaf");
    }

    @Override
    public void remove(Component component) {
        System.out.println("Cannot remove to a leaf");
    }

    //叶节点的具体方法，此处是显示其名称和级别
    @Override
    public void display(int depth) {
        System.out.println(new String("-") + name);
    }

}