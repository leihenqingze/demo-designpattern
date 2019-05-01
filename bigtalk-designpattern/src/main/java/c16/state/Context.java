package c16.state;

import lombok.Getter;

//Context类，维护一个ConcreteState子类的实例，这个实例定义当前的状态
public class Context {

    @Getter
    private State state;

    //定义Context的初始状态
    public Context(State state){
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态：" + state.getClass().getSimpleName());
    }

    //对请求做处理，并设置下一状态
    public void request(){
        state.handle(this);
    }

}