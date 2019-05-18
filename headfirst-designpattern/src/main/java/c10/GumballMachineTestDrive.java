package c10;

/**
 * 通过状态模式我们局部化了每个状态的行为，这样一来，如果我们针对某个状态做了改变，就不会把其他的代码给搞乱了。
 * 这也使得事情更容易改变和理解。
 * 这样就遵守了"封装变化"原则。这样将每个状态的行为都放在各自的类中，那么每个状态只要实现它自己的动作就可以了。
 * 糖果机只需要委托给代表当前状态的状态对象。我们还是需要改变代码，但是改变将局限在小范围内。因为加入一个新的
 * 状态，就意味着我们要加入一个新的类还有可能要改变一些转换。
 */
public class GumballMachineTestDrive {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }

}