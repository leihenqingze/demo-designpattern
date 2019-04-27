package c01;

/**
 * 如果将所有的运算逻辑放在同一个类中，如果修改或增加新的运算逻辑，却需要让所有的运算都来参与编译
 * 很容易修改错误。如果将不同运算逻辑分离，修改或增加其中一个不影响另外的几个。
 * <p>
 * 到底要实例化谁，将来会不会增加实例化的对象，这是很容易变化的地方，
 * 应该考虑用一个单独的类来做这个初始化实例的过程，这就是工厂。
 * <p>
 * 简单工厂：通过增加不同的实现类扩展现有的程序，不需要对现有的实现进行修改。在一定程度上实现了开闭原则。
 * 简单工厂属于创建型模式，封装了对象的创建过程。
 */
public class OperationFactory {

    public static Operation createOperation(String operate) {
        Operation oper = null;
        switch (operate) {
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
        }
        return oper;
    }

}