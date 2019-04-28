package c08.calculate;

import c01.Operation;
import c01.OperationDiv;

public class DivFactory implements Factory {

    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }

}
