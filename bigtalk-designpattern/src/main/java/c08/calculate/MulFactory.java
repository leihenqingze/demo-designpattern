package c08.calculate;

import c01.Operation;
import c01.OperationMul;

public class MulFactory implements Factory {

    @Override
    public Operation createOperation() {
        return new OperationMul();
    }

}
