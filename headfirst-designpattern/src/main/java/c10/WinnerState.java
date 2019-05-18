package c10;

/**
 * WinnerState状态会发放两个糖果，可以将发放两个糖果的代码放在SoldState中。当然这样做有缺点，因为等于是将两个状态用一个
 * 状态类来代表。这样做你牺牲了状态类的清晰易懂来减少一些冗余代码。你也应该考虑到在前面的章节中所学到的原则：一个类，
 * 一个责任。将WinnerState状态的责任放进SoldState状态中，等于是SoldState状态具有两个责任。那么促销方案结束之后或者赢家
 * 的几率改变之后，你又该怎么办呢?所以，这必须用你的智慧来做折中。
 */
public class WinnerState implements State {

    GumballMachine gumballMachine;

    WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball");
    }

    @Override
    public void dispense() {
        System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

}