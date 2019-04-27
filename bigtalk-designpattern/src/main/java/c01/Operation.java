package c01;

import lombok.Data;

@Data
public abstract class Operation {

    private double numberA;
    private double numberB;

    protected abstract double getResult();

}