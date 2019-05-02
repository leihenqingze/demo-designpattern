package c20;

public class Main {

    public static void main(String[] args) {

        ConcreteAggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.add("大鸟");
        aggregate.add("小菜");
        aggregate.add("行李");
        aggregate.add("老外");
        aggregate.add("公交内部员工");
        aggregate.add("小偷");

        Iterator<String> iterator = aggregate.createIterator();
        while (!iterator.isDone()){
            String item = iterator.next();
            System.out.println(item);
        }
    }

}
