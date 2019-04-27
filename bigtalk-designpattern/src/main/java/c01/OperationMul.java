package c01;

public class OperationMul extends Operation {

    @Override
    protected double getResult() {
        return getNumberA() * getNumberB();
    }

}