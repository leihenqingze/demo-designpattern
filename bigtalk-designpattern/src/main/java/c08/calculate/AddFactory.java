package c08.calculate;

import c01.Operation;
import c01.OperationAdd;

public class AddFactory implements Factory {

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }

}
