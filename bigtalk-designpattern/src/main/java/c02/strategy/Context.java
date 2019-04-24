package c02.strategy;

import lombok.AllArgsConstructor;

//上下文
@AllArgsConstructor
public class Context {

    private Strategy strategy;

    //上下文接口
    public void contextInterface() {
        //根据具体的策略对象，调用其算法的方法
        strategy.algorithmInterface();
    }

}
