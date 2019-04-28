package c08.calculate;

import c01.Operation;

public class Main {

    public static void main(String[] args) {

        Factory factory = new AddFactory();
        Operation operation = factory.createOperation();
        operation.setNumberA(1);
        operation.setNumberB(2);

        System.out.println(operation.getResult());

    }

}
