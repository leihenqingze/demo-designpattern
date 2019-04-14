package c24.chainresponsibility;

import lombok.Setter;

public abstract class Handler {

    @Setter
    protected Handler successor;

    public abstract void handleRequest(int request);

}
