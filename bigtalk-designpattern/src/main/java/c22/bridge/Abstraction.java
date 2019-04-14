package c22.bridge;

import lombok.Setter;

public abstract class Abstraction {

    @Setter
    protected Implementor implementor;

    public abstract void operation();

}
