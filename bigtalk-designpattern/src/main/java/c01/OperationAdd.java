package c01;

public class OperationAdd extends Operation {

    @Override
    protected double getResult() {
        return getNumberA() + getNumberB();
    }

}