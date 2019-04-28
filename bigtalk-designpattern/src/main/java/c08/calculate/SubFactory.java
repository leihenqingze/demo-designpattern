package c08.calculate;

import c01.Operation;
import c01.OperationSub;

public class SubFactory implements Factory {

    @Override
    public Operation createOperation() {
        return new OperationSub();
    }

}
