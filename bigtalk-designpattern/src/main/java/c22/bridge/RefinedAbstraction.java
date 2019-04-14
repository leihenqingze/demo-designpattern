package c22.bridge;

public class RefinedAbstraction extends Abstraction{

    @Override
    public void operation() {
        implementor.operation();
    }

}
