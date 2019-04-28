package c01;

public class OperationSub extends Operation {

    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }

}