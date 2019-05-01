package c16.state;

//ConcreteState类，具体状态，每一个子类实现一个与Context的一个状态相关的行为。
public class ConcreteStateA implements State{

    public void handle(Context context) {
        context.setState(new ConcreteStateB());
    }

}