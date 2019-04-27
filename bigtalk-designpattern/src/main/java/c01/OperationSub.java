package c01;

public class OperationSub extends Operation {

    @Override
    protected double getResult() {
        return getNumberA() - getNumberB();
    }

}