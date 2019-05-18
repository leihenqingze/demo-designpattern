package c10;

import lombok.Getter;
import lombok.Setter;

public class GumballMachine {

    /**
     * 试图通过使用Context上的getter()把依赖减到最小，而不是显式硬编码具体状态类。
     */
    @Getter
    State soldOutState;
    @Getter
    State hasQuarterState;
    @Getter
    State noQuarterState;
    @Getter
    State soldState;
    @Getter
    State winnerState;

    @Setter
    State state = soldOutState;
    @Getter
    int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count--;
        }
    }

}