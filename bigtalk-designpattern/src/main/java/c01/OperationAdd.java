package c01;

public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }

}