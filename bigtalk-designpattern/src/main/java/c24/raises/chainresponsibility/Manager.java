package c24.raises.chainresponsibility;

import c24.raises.Request;
import lombok.Setter;

public abstract class Manager {

    protected String name;

    @Setter
    protected Manager superior;

    public Manager(String name){
        this.name = name;
    }

    public abstract void requestApplications(Request request);

}
