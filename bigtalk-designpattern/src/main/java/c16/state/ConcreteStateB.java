package c16.state;

/**
 * Created by haihao on 18-5-5.
 */
public class ConcreteStateB implements State{
    public void handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}
